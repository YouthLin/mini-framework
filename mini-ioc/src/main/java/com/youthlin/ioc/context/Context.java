package com.youthlin.ioc.context;

import java.util.Map;
import java.util.Set;

/**
 * 创建： youthlin.chen
 * 时间： 2017-08-10 13:31.
 */
public interface Context {
    void registerBean(Object bean);

    void registerBean(Object bean, String name);

    Object getBean(String name);

    <T> T getBean(Class<T> clazz);

    <T> T getBean(String name, Class<T> clazz);

    <T> Set<T> getBeans(Class<T> clazz);

    int getBeanCount();

    Map<String, Object> getNameBeanMap();

    Map<Class, Object> getClazzBeanMap();

    Set<Object> getBeans();

    Set<String> getUnloadedClass();

}
