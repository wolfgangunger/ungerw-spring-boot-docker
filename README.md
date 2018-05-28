http://localhost:8080/spring-docker/hello

https://springboot.aws.de.altemista.cloud/spring-boot/hello

016973021151.dkr.ecr.eu-west-3.amazonaws.com/ecs-repository:spring-boot

docker build -f src/main/docker/Dockerfile -t $TAG_NAME .
docker build -f src/main/docker/Dockerfile -t spring-boot .
docker build -f src/main/docker/Dockerfile -t 016973021151.dkr.ecr.eu-west-3.amazonaws.com/ecs-repository:spring-boot .
  
docker run -d -p 8080:8080 spring-boot 
docker run -d -p 8080:8080 016973021151.dkr.ecr.eu-west-3.amazonaws.com/ecs-repository:spring-boot

aws configure

 $(aws ecr get-login --region eu-west-3 --no-include-email) 
 docker push 016973021151.dkr.ecr.eu-west-3.amazonaws.com/ecs-repository:spring-boot 
  
