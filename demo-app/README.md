Requirements:

-   JDK 21+

To run the application:

1. `cd` into the root folder (`hackathon`)
2. Run the following command:

```
java -javaagent:lib/opentelemetry-javaagent.jar -Dotel.javaagent.configuration-file=src/main/resources/otel.yml -jar target/hackathon-0.0.1-SNAPSHOT.jar --debug
```
