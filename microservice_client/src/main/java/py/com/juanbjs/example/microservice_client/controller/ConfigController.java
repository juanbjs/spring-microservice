package py.com.juanbjs.example.microservice_client.controller;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/service")
public class ConfigController {

    /* POSTGRES */
	@Value("${microserviceClient.name}")
	private String name;
	@Value("${microserviceClient.someValue}")
	private String someValue;
	@Value("${microserviceClient.otherValue}")
    private String otherValue;


    @GetMapping("/v1/configuration")
	public String getConfigutation(){
		return "name= " + name + ", someValue= " + someValue + ", otherValue= " + otherValue;
	}

}