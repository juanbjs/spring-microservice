FROM openjdk:8-jre-alpine
VOLUME /tmp

COPY target/eurekaServer.jar /opt/app.jar

# Add curl command
RUN apk --no-cache add curl

## THE LIFE SAVER
# Add wait-for-it
COPY wait-for-config-server.sh /opt/wait-for-it.sh 
RUN chmod +x /opt/wait-for-it.sh

CMD ["/opt/wait-for-it.sh", "http://10.5.2.188:7080/eureka-server/default", "--", "java", "-jar /opt/app.jar"]
EXPOSE 80