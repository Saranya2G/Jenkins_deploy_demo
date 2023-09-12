FROM openjdk:8
EXPOSE 9000
ADD target/sample-devops.jar sample-devops.jar
ENTRYPOINT ["java","-jar","/sample-devops.jar"]
