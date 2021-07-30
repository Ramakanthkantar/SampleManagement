package com.kantar.chinapannel.chinapannelmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.google.common.base.Predicate;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.ApiSelectorBuilder;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ChinaPannelManagementApplication {	

	public static void main(String[] args) {
		SpringApplication.run(ChinaPannelManagementApplication.class, args);
	}
	 @Bean
	  public ApiSelectorBuilder productApi() {
	      return new Docket(DocumentationType.SWAGGER_2).select().apis((Predicate<RequestHandler>) RequestHandlerSelectors.basePackage("com.kantar.chinapannel.chinapannelmanagement"));
	       //.apis(RequestHandlerSelectors.basePackage("com.kantar.chinapannelmanagement")).build();
	 }

}
