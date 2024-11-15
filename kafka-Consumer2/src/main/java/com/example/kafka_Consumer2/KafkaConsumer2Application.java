package com.example.kafka_Consumer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KafkaConsumer2Application {
	@KafkaListener(topics="demo1", groupId="b")
	public void consumer(String message){
		System.out.println("Consumer 2 received "+message);

	}

	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumer2Application.class, args);
	}

}
