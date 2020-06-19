package uk.org.hexsaw.logactaesque;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class PlayFixtureSQSConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(PlayFixtureSQSConsumer.class);

    @Autowired
    QueueMessagingTemplate queueMessagingTemplate;

    @SqsListener("play-fixture")  // This queue subscribes to SNS topic 'fixture-started'
    public void receiveMessage(String message) {
        LOGGER.info("Message received : [{}]", message);
    }
    
}