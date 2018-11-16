/**
 * 
 */
package com.jaxws.service;

import javax.xml.ws.Endpoint;

/**
 * @author Priyanka dhiman
 *
 */
public class SOAPPublisher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:8080/ws/person", new PersonServiceImpl());
	}

}
