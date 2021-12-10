FROM openjdk:11
ADD target/jenkins-sb-docker.jar jenkins-sb-docker.jar
EXPOSE  8080
ENTRYPOINT [ "java" , "-jar" , "jenkins-sb-docker.jar" ]