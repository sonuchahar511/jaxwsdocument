package com.chahar.webservice;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "com.chahar.webservice.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}

}