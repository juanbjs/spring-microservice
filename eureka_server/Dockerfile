FROM openjdk:8-jre-alpine
VOLUME /tmp

COPY target/eurekaServer.jar /opt/app.jar

# Add wait-for-it
#COPY wait-for-it.sh /opt/wait-for-it.sh 
#RUN chmod +x /opt/wait-for-it.sh

## THE LIFE SAVER
ADD https://github.com/ufoscout/docker-compose-wait/releases/download/2.2.1/wait /wait
RUN chmod +x /wait

EXPOSE 80

CMD /wait && java -jar /opt/app.jar

#ENTRYPOINT ["java","-XX:+UnlockExperimentalVMOptions","-XX:+UseCGroupMemoryLimitForHeap","-XX:MaxRAMFraction=1","-XshowSettings:vm","-Djava.security.egd=file:/dev/./urandom","-jar","/opt/app.jar"]

#ENTRYPOINT [ "/bin/sh", "-c" ]
#CMD ["/opt/wait-for-it.sh" , ${WAIT_HOSTS} , "--strict" , "--timeout=300" , "--" , "java -jar /opt/app.jar"]
