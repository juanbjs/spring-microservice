FROM openjdk:8-jre-alpine
VOLUME /tmp
COPY target/configServer.jar /opt/app.jar
COPY config-server-repository/* /opt/config-server-repository/
EXPOSE 80
ENTRYPOINT ["java","-XX:+UnlockExperimentalVMOptions","-XX:+UseCGroupMemoryLimitForHeap","-XX:MaxRAMFraction=1","-XshowSettings:vm","-Djava.security.egd=file:/dev/./urandom","-jar","/opt/app.jar"]