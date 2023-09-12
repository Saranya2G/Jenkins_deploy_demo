FROM openjdk:8
EXPOSE 8081
ADD target/sample-devops.jar sample-devops.jar
ENTRYPOINT ["java","-jar","/sample-devops.jar"]
