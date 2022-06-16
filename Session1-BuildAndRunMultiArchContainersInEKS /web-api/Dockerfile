ARG ARCH=
FROM ${ARCH}openjdk:8-jdk-alpine AS build

VOLUME /tmp
COPY webapi-ws.jar webapi-ws.jar
ENTRYPOINT ["java", "-jar","/webapi-ws.jar"]