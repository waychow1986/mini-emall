FROM --platform=linux/amd64 maven:3.6-jdk-8-alpine
ENV MAVEN_ARGS="-q -Dmaven.test.skip=true -Dmaven.javadoc.skip=true -Dmaven.proto.skip=true"
COPY ["." ,"/data"]
RUN  mvn ${MAVEN_ARGS}  package -f /data/pom.xml

FROM --platform=linux/amd64 openjdk:8-alpine3.9
EXPOSE 30460
ENV MODULE_NAME=emall-web
ENV VERSION=0.0.1-SNAPSHOT
ENV JVM_OPT=""
ENV REGSERVER_URL=http://rs
COPY --from=0 "/data/${MODULE_NAME}/target/${MODULE_NAME}-${VERSION}.jar" "/app/app.jar"
COPY --from=0 "/data/${MODULE_NAME}/target/lib/" "/app/lib/"
ENTRYPOINT   ["java", "-jar","/app/app.jar"]