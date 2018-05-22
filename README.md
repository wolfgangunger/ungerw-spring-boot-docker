http://localhost:8080/spring-docker/hello




#Spring Boot + Docker + JAX-RS Demo Application


<img src="http://www.adrianmilne.com/wp-content/uploads/2016/08/feature-image-template.png"/>

This is an example application created to demonstrate the use of the Spring Boot and Docker.

The Spring Boot app uses JAX-RS (Jersey), and the Docker deployment is to Docker Toolbox/Kinematic running on OSX (El Capitan)


Full details are available in an accompanying blog post - check it out here:

<br /><a href="http://www.adrianmilne.com/example-of-a-spring-boot-microservice-running-on-osxdocker-toolbox/">http://www.adrianmilne.com/example-of-a-spring-boot-microservice-running-on-osxdocker-toolbox/</a>


#Deploying a Spring Boot Microservice To Docker / AWS Elastic Beanstalk

<img src="http://www.adrianmilne.com/wp-content/uploads/2016/08/feature-image-template_edited-1.png"/>

This blog post builds on the previous one and details how to deploy the Docker image to AWS Elastic Beanstalk

Full details are available in an accompanying blog post - check it out here:

<br /><a href="http://www.adrianmilne.com/deploying-a-spring-boot-microservice-to-docker-aws-elastic-beanstalk/">http://www.adrianmilne.com/deploying-a-spring-boot-microservice-to-docker-aws-elastic-beanstalk/</a>


016973021151.dkr.ecr.eu-west-3.amazonaws.com/ecs-repository:spring-boot

docker build -f src/main/docker/Dockerfile -t $TAG_NAME .
docker build -f src/main/docker/Dockerfile -t spring-boot .
docker build -f src/main/docker/Dockerfile -t 016973021151.dkr.ecr.eu-west-3.amazonaws.com/ecs-repository:spring-boot .
  
docker run -d -p 8080:8080 spring-boot 
docker run -d -p 8080:8080 016973021151.dkr.ecr.eu-west-3.amazonaws.com/ecs-repository:spring-boot

aws configure

 $(aws ecr get-login --region eu-west-3 --no-include-email) 
 docker push 016973021151.dkr.ecr.eu-west-3.amazonaws.com/ecs-repository:spring-boot 
  
