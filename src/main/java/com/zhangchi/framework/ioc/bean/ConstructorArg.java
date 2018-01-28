package com.zhangchi.framework.ioc.bean;

import lombok.Data;
import lombok.ToString;

/**
 * @author zhangchi
 * @decription 构造参数的数据结构
 */
@Data
@ToString
public class ConstructorArg {
    /**
     * 构造参数的序号
     * */
    private int index;

    /**
     * 构造参数的名称
     * */
    private String name;

    /**
     * 构造参数的值
     * */
    private String value;

}
