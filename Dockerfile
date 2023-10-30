FROM adoptopenjdk:17-jdk-hotspot AS build
WORKDIR /home/app
COPY src ./src
COPY pom.xml .
RUN apt-get update && apt-get install -y maven
RUN mvn clean package

FROM openjdk:17-alpine
COPY --from=build /home/app/target/demo-0.0.1-SNAPSHOT.jar /usr/local/lib/demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/demo.jar"]