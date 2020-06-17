# Logactaesque Play Fixture

A long running service that:
* Consumes messages from an AWS SQS _play-fixture_ queue
* Extracts teams and associated dice from the payload
* Rolls corresponding dice using a service based upon [Logactaesque Dice Roller](https://github.com/logactaesque/dice-roller)
* Constructs a fixture result based upon the values the dice returns

To build and run the service locally via [Maven](https://maven.apache.org/):

    mvn clean spring-boot:run &

The applications assumes the presence of `.aws/credentials` in the $HOME folder with a default profile holding an AWS _key_ 
and _secret key_ associated with an IAM user with privelidges to access a _play-fixture_ queue within AWS.

Application built using
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Spring Cloud AWS](https://spring.io/projects/spring-cloud-aws)
