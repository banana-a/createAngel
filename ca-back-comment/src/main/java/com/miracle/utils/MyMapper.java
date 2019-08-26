package com.miracle.utils;

/**
 * @program: createAngel
 * @description:
 * @author: miracle
 * @create: 2019-08-22 12:36
 **/

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 自己的 Mapper
 * 特别注意，该接口不能被扫描到，否则会出错
 * <p>Title: MyMapper</p>
 * <p>Description: </p>
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}