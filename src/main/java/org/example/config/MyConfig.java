package org.example.config;

import org.example.person.Employee;
import org.example.person.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("org.example")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class MyConfig {
}
