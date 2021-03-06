package org.yagna.samples.activemq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class MessageSenderTest {
	@Autowired
	private MessageSender sender;

	@Test
	public void test() {
		sender.sendMessage("Sending a Test Mesasge");
	}

}
