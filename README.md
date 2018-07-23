http://localhost:8080/spring-docker/hello
with docker for windows
http://10.0.75.1:8080/spring-docker/hello

https://springboot.aws.de.altemista.cloud/spring-boot/hello

016973021151.dkr.ecr.eu-west-3.amazonaws.com/ecs-repository:spring-boot

docker build -f src/main/docker/Dockerfile -t $TAG_NAME .
docker build -f src/main/docker/Dockerfile -t spring-boot .
docker build -f src/main/docker/Dockerfile -t 016973021151.dkr.ecr.us-west-1.amazonaws.com/ecs-example-repository:spring-boot .
  
docker run -d -p 8080:8080 spring-boot 
docker run -d -p 8080:8080 016973021151.dkr.ecr.eu-west-3.amazonaws.com/ecs-repository:spring-boot

aws configure

 $(aws ecr get-login --region eu-west-3 --no-include-email) 
  $(aws ecr get-login --region us-west-1 --no-include-email) 
 docker push 016973021151.dkr.ecr.eu-west-3.amazonaws.com/ecs-repository:spring-boot 
 docker push 016973021151.dkr.ecr.us-west-1.amazonaws.com/ecs-example-repository:spring-boot

  
