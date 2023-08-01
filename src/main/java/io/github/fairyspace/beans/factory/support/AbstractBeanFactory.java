package io.github.fairyspace.beans.factory.support;

import io.github.fairyspace.beans.BeanFactory;
import io.github.fairyspace.beans.factory.config.BeanDefinition;

/*抽象类实现一个接口，也可以不实现*/

/*抽象类可以通过继承引入内部方法理解成内包；也可以依赖外部属性类引入方法*/
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String beanName) {
        Object bean = getSingleton(beanName);

        /*存在就直接返回*/
        if (bean != null) return bean;

        /*如果不存在，那么就创建*/
            /*获取创建Bean的原材料也就是BeanDefinition*/
            /*创建Bean*/

        BeanDefinition beanDefinition = getBeanDefinition(beanName);

        return createBean(beanName,beanDefinition);

    }

    protected abstract Object createBean(String beanName,BeanDefinition beanDefinition);

    protected abstract BeanDefinition getBeanDefinition(String beanName);
}
