package io.github.fairyspace.beans.factory.support;

import io.github.fairyspace.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/*可以理解成存放Bean的数据库，提供对外读和存的接口*/
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    Map<String,Object> singletonObjects=new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    @Override
    public void registerSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName,singletonObject);
    }
}
