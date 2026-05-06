package com.nt.conifg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.nt.sbeans")
@PropertySource("com/nt/comp/info.properties")
public class AppConfig {

}
