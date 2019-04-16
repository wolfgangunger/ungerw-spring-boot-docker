http://localhost:8080/spring-docker/hello
with docker for windows
http://10.0.75.1:8080/spring-docker/hello

https://springboot.aws.de.altemista.cloud/spring-boot/hello

016973021151.dkr.ecr.eu-west-3.amazonaws.com/ecs-repository:spring-boot

docker build -f src/main/docker/Dockerfile -t $TAG_NAME .
docker build -f src/main/docker/Dockerfile -t spring-boot .
docker build -f src/main/docker/Dockerfile -t 0169...../ecs-example-repository:spring-boot .
docker build -f src/main/docker/Dockerfile -t 016973021151.dkr.ecr.us-east-2.amazonaws.com/ecrungerw:spring-boot .
docker build -f src/main/docker/Dockerfile -t 016973021151.dkr.ecr.us-west-1.amazonaws.com/ecs-example-repository:spring-boot .
  
docker run -d -p 8080:8080 spring-boot 
docker run -d -p 8080:8080 016973021151.dkr.ecr.us-east-2.amazonaws.com/ecrungerw:spring-boot

aws configure

$(aws ecr get-login --no-include-email --region us-east-2)
$(aws ecr get-login --no-include-email --region us-west-1)
 docker push 016973021151.dkr.ecr.us-east-2.amazonaws.com/ecrungerw:spring-boot 
 docker push 0169....us-west-1.amazonaws.com/ecs-example-repository:spring-boot
 docker push 016973021151.dkr.ecr.us-west-1.amazonaws.com/ecs-example-repository:spring-boot


  
