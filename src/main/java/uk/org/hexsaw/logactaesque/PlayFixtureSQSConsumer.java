package uk.org.hexsaw.logactaesque;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import uk.org.hexsaw.logactaesque.model.Fixture;

import java.io.IOException;

@Component
@Lazy
public class PlayFixtureSQSConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(PlayFixtureSQSConsumer.class);

    // @Autowired
    // private QueueMessagingTemplate queueMessagingTemplate;

    private ObjectMapper objectMapper = new ObjectMapper();

    @SqsListener("play-fixture")  // This queue subscribes to SNS topic 'fixture-started'
    public void receiveMessage(String message) {
        try {
            Fixture fixture = objectMapper.readValue(message, Fixture.class);
            LOGGER.info("Message received : [{}]", fixture);
        } catch(IOException e) {
            LOGGER.error("Error processing message [{}] \n {}", message, e.getMessage());
        }

    }

}