package io.github.fairyspace.beans;

import io.github.fairyspace.beans.factory.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*抽象的使用类，也就是使用者最原始的规范，可以理解为就是使用者*/
public interface BeanFactory {

    /*定义获取Bean实例*/
     Object getBean(String name);
}
