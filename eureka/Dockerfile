FROM openjdk:17-alpine

EXPOSE 8761

COPY ./target/eureka-0.0.1-SNAPSHOT.jar /

RUN sh -c 'touch eureka-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","/eureka-0.0.1-SNAPSHOT.jar"]

RUN chmod +x /eureka-0.0.1-SNAPSHOT.jar