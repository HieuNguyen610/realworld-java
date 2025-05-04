package com.mods.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.server.i18n.FixedLocaleContextResolver;

import java.util.Locale;

@SpringBootApplication
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

	@Bean
	public FixedLocaleContextResolver localeContextResolver () {
		return new FixedLocaleContextResolver(new Locale("nl", "NL"));
	}
}
