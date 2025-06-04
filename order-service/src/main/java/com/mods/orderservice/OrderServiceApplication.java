package com.mods.orderservice;

import com.mods.orderservice.beans.Calculator;
import com.mods.orderservice.beans.Operation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.server.i18n.FixedLocaleContextResolver;
import reactor.netty.http.client.HttpClient;

import java.util.Collection;
import java.util.Locale;

@SpringBootApplication
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

	@Bean
	public WebClient restClient(WebClient.Builder builder) {
		var httpClient = HttpClient.create().followRedirect(true);
		var connector = new ReactorClientHttpConnector(httpClient);
		return builder.clientConnector(connector).build();
	}
}
