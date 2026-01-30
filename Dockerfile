FROM eclipse-temurin:17-jre-ubi10-minimal

LABEL authors="nhannguyenh"

COPY target/simple-shop*.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]