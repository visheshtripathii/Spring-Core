package com.springcore.noXmlFile.beanAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// No need of @ComponentScan because we're not using @Component annotation
public class BeanConfig {

        @Bean // This will inform IOC Container that it has to make a bean of Employee class and name it as getEmployee
        public Employee getEmployee(){
            Employee emp= new Employee();
            return emp;
        }

}
