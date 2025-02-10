package com.springcore.noXmlFile;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // This annotation is used to inform IOC Container that this class will work as our config.xml
@ComponentScan(basePackages = "com.springcore.noXmlFile") // This annotation will inform IOC Container about the base package. Find bean in sub-packages from this location/ look for classes with @Component annotation.
public class JavaConfig {

}
