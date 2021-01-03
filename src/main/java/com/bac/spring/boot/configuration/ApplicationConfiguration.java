package com.bac.spring.boot.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = {"com.bac.spring.boot.entities"})
@EnableJpaRepositories(basePackages = {"com.bac.spring.boot.repositories"})
@ComponentScan(basePackages = {"com.bac.spring.boot.components", 
							   "com.bac.spring.boot.controllers"})
public class ApplicationConfiguration {

}
