FROM openjdk:17-alpine


COPY ./target/sales-0.0.1-SNAPSHOT.jar /

RUN sh -c 'touch sales-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","/sales-0.0.1-SNAPSHOT.jar"]

RUN chmod +x /sales-0.0.1-SNAPSHOT.jar