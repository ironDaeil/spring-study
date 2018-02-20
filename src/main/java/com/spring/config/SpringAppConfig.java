package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created with IntelliJ IDEA
 * User: 아이언
 * Date: 2018. 2. 18.
 * Time: 오전 2:57
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.spring.controller")
public class SpringAppConfig  {
}
