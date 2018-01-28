package com.zhangchi.framework.ioc.bean;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @author zhangchi
 * @decription 描述bean的数据结构
 */
@Data
@ToString
public class BeanDefinition {
    /**
     * bean的name
     * */
    private String name;
    /**
     * 继承的class的Name
     */
    private String className;
    /**
     * 实现的interface的Name
     * */
    private String interfaceName;

    /**
     * bean的构造参数列表
     * */
    private List<ConstructorArg> constructorArg;

    /**
     * bean的属性的列表
     * */
    private List<PropertyArg> propertyArgs;
}
