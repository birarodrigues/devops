FROM maven:alpine
ADD . /app/
WORKDIR /app

RUN mvn package
CMD java -cp target/devops-1.0-SNAPSHOT.jar pos.ifal.devops.HelloWorld
