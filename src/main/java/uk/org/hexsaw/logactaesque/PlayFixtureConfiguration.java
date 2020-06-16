package uk.org.hexsaw.logactaesque;

import com.amazonaws.auth.InstanceProfileCredentialsProvider;
import com.amazonaws.services.sqs.AmazonSQSAsync;
import com.amazonaws.services.sqs.AmazonSQSAsyncClientBuilder;

import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PlayFixtureConfiguration {

    public AmazonSQSAsync sqsClient() {
        InstanceProfileCredentialsProvider provider
                = new InstanceProfileCredentialsProvider(true);
        return AmazonSQSAsyncClientBuilder.standard()
                .build();
    }

    @Bean
    public QueueMessagingTemplate getQueueMessagingTemplate() {
        return new QueueMessagingTemplate(sqsClient());
    }

    @Bean
    public QueueMessagingTemplate queueMessagingTemplate(AmazonSQSAsync amazonSQSAsync) {
        return new QueueMessagingTemplate(amazonSQSAsync);
    }

}