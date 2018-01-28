package com.zhangchi.framework.ioc.bean;

import lombok.Data;
import lombok.ToString;

/**
 * @author 张驰
 * @description 属性的数据结构
 */
@Data
@ToString
public class PropertyArg {
    /**
     * 属性名称
     * */
    private String name;

    /**
     * 属性的值
     * */
    private String value;

    /**
     * 属性的类型名称
     * */
    private String typeName;
}
