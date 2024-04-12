FROM --platform=linux/amd64 maven:3.6-jdk-8-alpine
ENV MAVEN_ARGS="-q -Dmaven.test.skip=true -Dmaven.javadoc.skip=true -Dmaven.proto.skip=true"
COPY ["." ,"/data"]
RUN  mvn ${MAVEN_ARGS}  package -f /data/pom.xml

FROM --platform=linux/amd64 openjdk:8-alpine3.9
EXPOSE 8082
COPY --from=0 "/data/emall-product/target/emall-product-0.0.1-SNAPSHOT.jar" "/app/emall-product-0.0.1-SNAPSHOT.jar"
COPY --from=0 "/data/emall-product/target/lib/" "/app/lib/"
ENTRYPOINT java -jar '-Dconsul_client_ip=${HOST_IP}' /app/emall-product-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod