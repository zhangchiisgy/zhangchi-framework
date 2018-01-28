package com.zhangchi.framework.ioc.utils;

/**
 * @description 通过className获取对象的class
 * */
public class ClassUtils {

    public static ClassLoader getDefultClassLoader(){
        return Thread.currentThread().getContextClassLoader();
    }

    public static Class loadClass(String className){
        try {
            return getDefultClassLoader().loadClass(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

}
