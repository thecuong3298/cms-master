FROM openjdk:11-jdk
COPY ./target/cms-master-0.0.1.jar cms-master.jar
ENTRYPOINT ["java","-jar","cms-master.jar"]
