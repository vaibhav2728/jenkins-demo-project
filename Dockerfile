FROM openjdk:11
EXPOSE 8081
ADD target/jenkins-demo-project-0.0.1-SNAPSHOT.jar docker-jenkins-integration-sample.jar
ENTRYPOINT ["java","-jar","/docker-jenkins-integration-sample.jar"]