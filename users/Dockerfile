FROM openjdk:17-alpine


COPY ./target/users-0.0.1-SNAPSHOT.jar /

RUN sh -c 'touch users-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","/users-0.0.1-SNAPSHOT.jar"]

RUN chmod +x /users-0.0.1-SNAPSHOT.jar