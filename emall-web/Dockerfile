FROM --platform=linux/amd64 maven:3.6-jdk-8-alpine
ENV MAVEN_ARGS="-q -Dmaven.test.skip=true -Dmaven.javadoc.skip=true -Dmaven.proto.skip=true"
COPY ["." ,"/data"]
RUN  mvn ${MAVEN_ARGS}  package -f /data/pom.xml

FROM --platform=linux/amd64 openjdk:8-alpine3.9
EXPOSE 8080
COPY --from=0 "/data/emall-web/target/emall-web-0.0.1-SNAPSHOT.jar" "/app/emall-web-0.0.1-SNAPSHOT.jar"
COPY --from=0 "/data/emall-web/target/lib/" "/app/lib/"
ENTRYPOINT java -jar '-Dconsul_client_ip=${HOST_IP}' /app/emall-web-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod