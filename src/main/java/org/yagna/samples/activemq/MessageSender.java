package org.yagna.samples.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Autowired
	@Qualifier("testQueue")
	private String queue;
	
	public void sendMessage(final String message){
		this.jmsTemplate.convertAndSend(this.queue, message);
	}
}
