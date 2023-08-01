package io.github.fairyspace.beans.factory.config;

public interface SingletonBeanRegistry {
    /*获取实例bean信息*/
    Object getSingleton(String beanName);

    /*把bean实例信息存起来*/
    void registerSingleton(String name,Object singletonObject);
}
