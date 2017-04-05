package com.jim.framework.cloud.provider;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("com.jim")
public class ProviderApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ProviderApplication.class).web(true).run(args);
	}
}
