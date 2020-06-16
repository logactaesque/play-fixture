package uk.org.hexsaw.logactaesque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.autoconfigure.context.ContextRegionProviderAutoConfiguration;

@SpringBootApplication
public class PlayFixtureApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayFixtureApplication.class, args);
	}

}
