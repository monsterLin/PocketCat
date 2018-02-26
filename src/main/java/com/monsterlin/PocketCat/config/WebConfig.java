package com.monsterlin.PocketCat.config;

import com.monsterlin.PocketCat.filter.PcFilter;
import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : monsterLin
 * @email : monster941025@gmail.com
 * @github : https://github.com/monsterLin
 * @blog : https://monsterlin.com/
 * @desc : web配置
 * @date : 2017/12/3
 */
@Configuration
public class WebConfig {
    @Bean
    public RemoteIpFilter remoteIpFilter(){
        return new RemoteIpFilter();
    }

    /**
     * 过滤链
     * @return
     */
    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean registration = new FilterRegistrationBean();
        //注册过滤器
        registration.setFilter(new PcFilter());
        //添加过滤规则
        registration.addUrlPatterns("/*");
        registration.addInitParameter("paramName","paramValue");
        registration.setName("SdFilter");
        registration.setOrder(1);
        return registration ;
    }
}