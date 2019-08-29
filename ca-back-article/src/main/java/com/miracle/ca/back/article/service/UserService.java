package com.miracle.ca.back.article.service;

import com.miracle.ca.back.article.entity.CaUser;
import com.miracle.ca.back.article.mapper.CaUserMapper;
import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.concurrent.TimeUnit;


/**
 * @program: createAngel
 * @description:
 * @author: miracle
 * @create: 2019-08-21 22:48
 **/

@Service
public class UserService {

    @Autowired
    CaUserMapper userMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    public String doLogin(String code) {

        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        // 创建Get请求
        HttpGet httpGet = new HttpGet("https://api.weixin.qq.com/sns/jscode2session?appid=wx42d5e954a29b012e&secret=a6129f9b6abe584fb260cafaf9b6117a&js_code=" + code +"&grant_type=authorization_code");
        // 响应模型
        CloseableHttpResponse response = null;
        try {
            // 配置信息
            RequestConfig requestConfig = RequestConfig.custom()
                    // 设置连接超时时间(单位毫秒)
                    .setConnectTimeout(5000)
                    // 设置请求超时时间(单位毫秒)
                    .setConnectionRequestTimeout(5000)
                    // socket读写超时时间(单位毫秒)
                    .setSocketTimeout(5000)
                    // 设置是否允许重定向(默认为true)
                    .setRedirectsEnabled(true).build();

            // 将上面的配置信息 运用到这个Get请求里
            httpGet.setConfig(requestConfig);

            // 由客户端执行(发送)Get请求
            response = httpClient.execute(httpGet);

            // 从响应模型中获取响应实体
            HttpEntity responseEntity = response.getEntity();
            if (responseEntity != null) {
                return EntityUtils.toString(responseEntity);
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // 释放资源
                if (httpClient != null) {
                    httpClient.close();
                }
                if (response != null) {
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "200";
    }

    public CaUser selectUser(String openid){
        return userMapper.selectUser(openid);
    }

    public CaUser getUser(String openid){
        CaUser user = userMapper.selectUser(openid);
        if (user != null){
            return user;
        }
        else {
            userMapper.insertUser(openid);
            user = userMapper.selectUser(openid);
            System.out.println(user.getUsername());
            return user;
        }
    }

    public void stopUser(String username,int time){
        redisTemplate.opsForValue().set(username, "", time, TimeUnit.SECONDS);
    }
}
