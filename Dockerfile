FROM openjdk:11-jdk
COPY ./target/cms-master-0.0.1.jar cms-master.jar
ENTRYPOINT ["java","-jar","-Djava.security.egd=file:./config/application.yml","cms-master.jar"]
