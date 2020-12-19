# Logactaesque Play Fixture

A long running service that:
* Consumes messages from an AWS SQS _play-fixture_ queue
* Post a raw SNS notification to topic to which a subscription to _play-fixture_ queue exists
* Extracts teams and associated dice from the payload
* Rolls corresponding dice using a service based upon [Logactaesque Dice Roller](https://github.com/logactaesque/dice-roller)
* Constructs a fixture result based upon the values the dice returns

An example message:

        {
        "fixtureId": "123e4567-e89b-12d3-a456-556642440000",
        "raisedAt": "2020-06-06T12:16:53.586",
        "venue": "The Emirates Stadium, London, N5 1BU",
        "tournament": "Season 1 Logactaesque League",
        "homeTeam": {
            "teamId": "123e4567-e89b-12d3-a456-556642440000",
            "name": "Arsenal",
            "shortName": "Arsenal"
        },
        "awayTeam": {
            "teamId": "123e4567-e89b-12d3-a456-556642440100",
            "name": "West Bromwich Albion",
            "shortName": "WBA"
        }
        }

To build and run the service locally via [Maven](https://maven.apache.org/):

    mvn clean spring-boot:run &

The applications assumes the presence of `.aws/credentials` in the $HOME folder with a default profile holding an AWS _key_ 
and _secret key_ associated with an IAM user with privelidges to access a _play-fixture_ queue within AWS.

Application built using
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Spring Cloud AWS](https://spring.io/projects/spring-cloud-aws)
