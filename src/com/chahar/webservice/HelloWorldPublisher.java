package com.chahar.webservice;

import javax.xml.ws.Endpoint;

//Endpoint publisher
public class HelloWorldPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:7779/ws/document", new HelloWorldImpl());
//		Endpoint.publish("http://localhost:1111/hello231", new HelloWorldImpl());

	}

}