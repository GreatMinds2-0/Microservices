FROM openjdk:17-alpine
ENV PORT 8084
EXPOSE 8084

COPY ./target/shipping-0.0.1-SNAPSHOT.jar /

RUN sh -c 'touch shipping-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","/shipping-0.0.1-SNAPSHOT.jar"]

RUN chmod +x /shipping-0.0.1-SNAPSHOT.jar