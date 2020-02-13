package com.property;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.property")
@PropertySource("classpath:sport.properties")
public class SportConfig{

}
