package com.chli.config;

import com.chli.interceptor.BookAdminInterceptor;
import com.chli.interceptor.ErrorInterceptor;
import com.chli.interceptor.LoginInterceptor;
import com.chli.interceptor.SystemAdminInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class InterceptorConfig extends WebMvcConfigurationSupport {


    @Autowired
    private ErrorInterceptor errorInterceptor;

    @Autowired
    private LoginInterceptor loginInterceptor;

    @Autowired
    private BookAdminInterceptor bookAdminInterceptor;

    @Autowired
    private SystemAdminInterceptor systemAdminInterceptor;

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(errorInterceptor).addPathPatterns("/error");
        registry.addInterceptor(loginInterceptor)
                .addPathPatterns("/user/**")
                .excludePathPatterns("/user/register")
                .excludePathPatterns("/**/login");

        registry.addInterceptor(bookAdminInterceptor)
                .addPathPatterns("/bookAdmin/**");

        registry.addInterceptor(systemAdminInterceptor)
                .addPathPatterns("/systemAdmin/**");
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
    }

}
