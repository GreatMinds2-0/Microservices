FROM openjdk:17-alpine

ENV PORT 8082
EXPOSE 8082

COPY ./target/users-0.0.1-SNAPSHOT.jar /

RUN sh -c 'touch users-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","/users-0.0.1-SNAPSHOT.jar"]

RUN chmod +x /users-0.0.1-SNAPSHOT.jar