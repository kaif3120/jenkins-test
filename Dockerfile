FROM openjdk:11
ADD target/docker-sb-mysql.jar docker-sb-mysql.jar
EXPOSE  9090
ENTRYPOINT [ "java" , "-jar" , "docker-sb-mysql.jar" ]