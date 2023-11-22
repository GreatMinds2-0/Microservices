FROM openjdk:17-alpine

COPY ./target/gateway-0.0.1-SNAPSHOT.jar /

RUN sh -c 'touch gateway-0.0.1-SNAPSHOT.jar'


ENTRYPOINT ["java","-jar","/gateway-0.0.1-SNAPSHOT.jar"]

RUN chmod +x /gateway-0.0.1-SNAPSHOT.jar