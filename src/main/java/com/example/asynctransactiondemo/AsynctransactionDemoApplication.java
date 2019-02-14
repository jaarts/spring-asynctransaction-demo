package com.example.asynctransactiondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Bean;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement(mode = AdviceMode.ASPECTJ)
@EnableAsync(mode = AdviceMode.ASPECTJ)
public class AsynctransactionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsynctransactionDemoApplication.class, args);
	}

	@Bean
	public TaskExecutor taskExecutor() {
		return new ThreadPoolTaskExecutor();
	}
}

