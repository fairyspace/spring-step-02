package io.github.fairyspace.beans.factory.support;

import io.github.fairyspace.beans.factory.config.BeanDefinition;

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
            registerSingleton(beanName,bean);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return bean;
    }

}
