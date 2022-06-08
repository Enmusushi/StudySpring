package com.enmusushi.studyseesion.config;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Component
public class JspConfig {
    private static final String prefix = "jsp";
    private static final String suffix = ".jsp";

    @Bean
    public InternalResourceViewResolver internalResourceViewResolver(){
        return new InternalResourceViewResolver(prefix,suffix);
    }

}
