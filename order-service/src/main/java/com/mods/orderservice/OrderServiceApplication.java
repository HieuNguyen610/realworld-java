package com.mods.orderservice;

import com.mods.orderservice.beans.Calculator;
import com.mods.orderservice.beans.Operation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.server.i18n.FixedLocaleContextResolver;

import java.util.Collection;
import java.util.Locale;

@SpringBootApplication
@PropertySource("classpath:your-external.properties")
public class OrderServiceApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(OrderServiceApplication.class, args);
	}

	@Bean
	public ApplicationRunner calculationRunner(Calculator calculator,
											   @Value("${lhs}") int lhs,
											   @Value("${rhs}") int rhs,
											   @Value("${op}") char op) {
		return args -> calculator.calculate(lhs, rhs, op);
	}

	@Bean
	public Calculator calculator(Collection<Operation> operations) {
		return new Calculator(operations);
	}
}
