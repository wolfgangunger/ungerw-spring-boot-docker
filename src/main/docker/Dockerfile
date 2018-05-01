FROM java:8
VOLUME /tmp
EXPOSE 8080
#ADD target/spring-boot.jar app.jar
#ADD build/libs/ungerw-spring-boot-docker-0.0.1-SNAPSHOT.jar app.jar
ADD build/libs/ungerw-spring-boot-docker-0.0.1-SNAPSHOT.jar app.jar
#ADD src-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]