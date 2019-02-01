package com.configServer.cserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(exclude = { ManagementWebSecurityAutoConfiguration.class, SecurityAutoConfiguration.class })
@EnableConfigServer
@EnableEurekaClient
public class CServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CServerApplication.class, args);
	}

}
