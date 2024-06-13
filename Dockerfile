FROM adoptopenjdk/openjdk11:jre-11.0.6_10-alpine
ADD target/order-api-1.0.1.jar order-api.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "order-api.jar"]