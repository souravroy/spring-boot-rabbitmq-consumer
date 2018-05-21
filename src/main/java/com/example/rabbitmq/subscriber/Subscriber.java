package com.example.rabbitmq.subscriber;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Subscriber {
	
	@RabbitListener(queues="${srv.rabbitmq.queue}")
	public void receivedMessage(String message) {
		System.out.println("Received message: "+ message);
	}

}
