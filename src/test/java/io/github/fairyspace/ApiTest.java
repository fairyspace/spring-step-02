package io.github.fairyspace;

import io.github.fairyspace.bean.UserService;
import io.github.fairyspace.beans.BeanFactory;
import io.github.fairyspace.beans.factory.config.BeanDefinition;
import io.github.fairyspace.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ApiTest {
    @Test
    public void test_BeanFactory() {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.准备bean的原材料
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        // 4.第二次获取 bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getSingleton("userService");
        userService_singleton.queryUserInfo();
    }
}
