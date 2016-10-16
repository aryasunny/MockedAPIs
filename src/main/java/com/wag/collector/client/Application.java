package com.wag.collector.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = { "com.wag" })
public class Application {
	public static void main(String[] args) {
		//System.getProperties().put("http.proxyHost", "172.28.97.25");
		//System.getProperties().put("http.proxyPort", "8080");
		//System.getProperties().put("https.proxyHost", "172.28.97.25");
		//System.getProperties().put("https.proxyPort", "8080");

		System.setProperty("jsse.enableSNIExtension", "false");

		SpringApplication.run(Application.class, args);
	}
}