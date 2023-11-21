FROM openjdk:17-alpine

ENV PORT 8085
EXPOSE 8085

COPY ./target/payment-0.0.1-SNAPSHOT.jar /

RUN sh -c 'touch payment-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","/payment-0.0.1-SNAPSHOT.jar"]

RUN chmod +x /payment-0.0.1-SNAPSHOT.jar