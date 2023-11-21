FROM openjdk:17-alpine
ENV PORT 8084
EXPOSE 8084

COPY ./target/Shipping-0.0.1-SNAPSHOT.jar /

RUN sh -c 'touch Shipping-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","/Shipping-0.0.1-SNAPSHOT.jar"]

RUN chmod +x /Shipping-0.0.1-SNAPSHOT.jar