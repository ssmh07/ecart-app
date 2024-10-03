FROM openjdk:17-jre-slim
VOLUME /tmp
COPY target/product-service.jar product-service.jar
ENTRYPOINT ["java","-jar","/product-service.jar"]
