http://localhost:8080/spring-docker/hello
with docker for windows
http://10.0.75.1:8080/spring-docker/hello


docker build -f src/main/docker/Dockerfile -t $TAG_NAME .
docker build -f src/main/docker/Dockerfile -t spring-boot .
docker build -f src/main/docker/Dockerfile -t 0169...../ecs-example-repository:spring-boot .
docker build -f src/main/docker/Dockerfile -t 0169.....dkr.ecr.us-west-1.amazonaws.com/ecs-example-repository:spring-boot .
docker build -f src/main/docker/Dockerfile -t 016973021151.dkr.ecr.us-west-1.amazonaws.com/ecs-example-repository:spring-boot .
  
docker run -d -p 8080:8080 spring-boot 
docker run -d -p 8080:8080 0169......dkr.ecr.us-west-1.amazonaws.com/ecs-example-repository:spring-boot

aws configure

$(aws ecr get-login --no-include-email --region us-west-1)
 docker push 0169......dkr.ecr.us-west-1.amazonaws.com/ecs-example-repository:spring-boot
 docker push 016973021151.dkr.ecr.us-west-1.amazonaws.com/ecs-example-repository:spring-boot

  
