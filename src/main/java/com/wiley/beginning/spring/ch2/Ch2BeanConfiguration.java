package com.wiley.beginning.spring.ch2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//该注解告诉spring，该类是一个bean并且包含配置元数据
@Configuration
public class Ch2BeanConfiguration {
    @Bean //被该注解修饰的方法在启动期间被spring容器调用，而返回的值被视为spring管理的bean,并且工厂方法的返回值被视为接口
    public AccountService accountService(){
        AccountServiceImpl bean = new AccountServiceImpl();
        bean.setAccountDao(accountDao());
        return bean;
    }
    @Bean
    public AccountDao accountDao(){
        AccountDaoInMemoryImpl bean = new AccountDaoInMemoryImpl();
        return bean;
    }
}
