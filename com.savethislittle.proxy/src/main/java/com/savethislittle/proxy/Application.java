package com.savethislittle.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.savethislittle.proxy.filters.SimpleFilter;



@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	
	  @Bean
	  public SimpleFilter simpleFilter() {
	    return new SimpleFilter();
	  }
}
