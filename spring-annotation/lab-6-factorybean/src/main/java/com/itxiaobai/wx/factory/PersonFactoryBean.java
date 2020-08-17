package com.itxiaobai.wx.factory;

import com.itxiaobai.wx.bean.Person;
import org.springframework.beans.factory.FactoryBean;

public class PersonFactoryBean implements FactoryBean {

    /**
     *返回对象，这个对象会被放入容器
     * @return
     * @throws Exception
     */
    @Override
    public Object getObject() throws Exception {
        System.out.println("PersonFactoryBean");
        return new Person();
    }

    /**
     * 返回对象的类型
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }

    /**
     * 控制是否单实例 true为单实例，false为多实例
     * @return
     */
    @Override
    public boolean isSingleton() {
        return true;
    }
}
