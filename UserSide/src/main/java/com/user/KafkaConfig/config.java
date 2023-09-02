package com.user.KafkaConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.user.applicationConstants.constants;

@Configuration
public class config {

	@KafkaListener(topics = constants.TOPIC_NAME,groupId = constants.GROUP_ID)
	public void updateLocation(String value) {

		System.out.println(" locatio is -> "+value);
	}
}
