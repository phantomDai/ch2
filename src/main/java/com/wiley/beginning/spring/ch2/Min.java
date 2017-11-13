package com.wiley.beginning.spring.ch2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Min {
    public static void main(String[] args) {
        //AnnotationConfigApplicationContext负责处理给予java的配置元数据类
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new
                AnnotationConfigApplicationContext(Ch2BeanConfiguration.class);
        //使用xml文件作为元数据配置
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "com/wiley/begoinning/spring/ch2/ch2-beans.xml"
        );
    }
}
