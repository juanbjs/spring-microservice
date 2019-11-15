# Spring-microservice

This repository creates a Spring-could project using the configuration server, the Eureka server.
This project has a config-first structure, that is, the first active service is config_server, then eureka_server and other services after eureka_server is active.

In the dockeritacion I use wait-for-it to wait for the other applications to be active.

## Installation

```git
git clone https://github.com/juanbjs/keycloak-react-spring.git

if you have npm installed
  cd spring-microservice
  npm run build-and-deploy

if you don't have npm installed
  Create war
    cd configServer
      mvn clean package
    cd eureka_server
      mvn clean package
    cd microservice_client 
      mvn clean package

  Build docker-compose
    docker-compose build
  
  Start docker-compose
    docker-compose up -d
```

## References

https://dzone.com/articles/buiding-microservice-using-springboot-and-docker

https://www.baeldung.com/dockerizing-spring-boot-application

https://docs.docker.com/compose/startup-order/

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License

[MIT](https://choosealicense.com/licenses/mit/)