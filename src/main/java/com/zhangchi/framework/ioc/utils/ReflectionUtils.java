package com.zhangchi.framework.ioc.utils;

import java.lang.reflect.Field;

/**
 * 设置obj的field为value
 * 注入字段
 * */

public class ReflectionUtils {

    public static void injectField(Field field,Object obj,Object value) throws IllegalAccessException {
        if(field != null) {
            field.setAccessible(true);
            field.set(obj, value);
        }
    }
}