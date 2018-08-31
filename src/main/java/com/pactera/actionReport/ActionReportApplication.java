package com.pactera.actionReport;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.pactera.actionReport.controller","com.pactera.actionReport.service"})
@MapperScan(basePackages = "com.pactera.actionReport.dao")
public class ActionReportApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActionReportApplication.class, args);
	}
}