/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 *
 * @author 310212371
 */
public class DisplayNameBeanPostProcessor implements BeanPostProcessor{
   
    public Object postProcessBeforeInitialization(Object bean,String beanName){
        System.out.println("before initializing bean->"+beanName);
        System.out.println(bean.getClass());
     return bean;
    }
    
    public Object postProcessAfterInitialization(Object bean,String beanName){
        System.out.println("after initializing bean->"+beanName);
    return bean;
    }
}
