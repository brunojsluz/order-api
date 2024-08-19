FROM eclipse-temurin:21
EXPOSE 8080
ADD /build/libs/order-api-0.0.1-SNAPSHOT.jar order-api.jar
ENTRYPOINT ["java", "-jar", "order-api.jar"]