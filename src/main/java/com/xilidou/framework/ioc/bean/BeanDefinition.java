package com.xilidou.framework.ioc.bean;

import lombok.Data;
import lombok.ToString;

import java.util.List;


/**
 * @author Zhengxin
 * @descrption 描述IOC框架需要管理的对象
 */
@Data
@ToString
public class BeanDefinition {

    private String name;

    private String className;

    private String interfaceName;

    private List<ConstructorArg> constructorArgs;

    private List<PropertyArg> propertyArgs;

}
