FROM maven:3.6.3-jdk-11
WORKDIR /app
RUN apt-get -y update
RUN apt-get -y install git
RUN git clone https://github.com/allesson182/Employee
RUN cd /app/Employee
RUN mvn clean install -f /app/Employee/pom.xml
ENTRYPOINT ["java", "-jar", "/app/Employee/target/Employee-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080