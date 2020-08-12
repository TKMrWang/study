package com.itxiaobai.wx.myregister;

import com.itxiaobai.wx.bean.User;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     *
     * @param importingClassMetadata 当前类的注解信息
     * @param registry  BeanDefinition注册类；所有需要添加到容器中的Bean，
     *                  通过调用BeanDefinitionRegistry.registerBeanDefinition手动注册到容器中
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean red = registry.containsBeanDefinition("com.itxiaobai.wx.bean.Red");
        boolean yellow = registry.containsBeanDefinition("com.itxiaobai.wx.bean.Yellow");
        if (red&&yellow){
            //指定bean定义信息（包括bean的类型、作用域...）
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(User.class);
            //注册一个bean指定bean名字（id）
            registry.registerBeanDefinition("user",rootBeanDefinition);
        }
    }
}
