package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

@ComponentScan(basePackages = {
    "com.nt.sbeans",
    "com.nt.commans",
    "com.nt.factory"
})
public class AppConfig {

}
