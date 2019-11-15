FROM openjdk:8-jre-alpine
VOLUME /tmp

COPY target/microserviceClient.jar /opt/app.jar

# Add curl command
RUN apk --no-cache add curl

## THE LIFE SAVER
# Add wait-for-it
COPY wait-for-eureka-server.sh /opt/wait-for-it.sh 
RUN chmod +x /opt/wait-for-it.sh

CMD ["/opt/wait-for-it.sh", "http://10.5.2.188:8761", "--", "java", "-jar /opt/app.jar"]
EXPOSE 7081