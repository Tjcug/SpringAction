package com.hust.edu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * locate com.hust.edu
 * Created by MasterTj on 2019/1/11.
 */
@Configuration
@ComponentScan(basePackages = "com.hust.edu",excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,value = EnableWebMvc.class)
})
public class RootConfig {
}
