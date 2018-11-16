/**
 * 
 */
package com.jaxws.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.jaxws.bean.Person;
import com.jaxws.service.PersonService;


/**
 * @author Priyanka Dhiman
 *
 */
public class SOAPPublisherClient {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException {
		//check below URL in browser, you should see WSDL file
		URL wsdlURL = new URL("http://localhost:8080/ws/person?wsdl");
		//creating QName using targetNamespace and name
		QName qname = new QName("http://service.jaxws.mkyong.com/", "PersonServiceImplService"); 
		Service service = Service.create(wsdlURL, qname);
		//We need to pass interface and model beans to client
		PersonService ps = service.getPort(PersonService.class);
		Person p1 = new Person();
		p1.setId(10);
		p1.setName("Priyanka");
		p1.setAge(24);
		Person p2 = new Person();
		p2.setId(20);
		p2.setName("Pinks");
		p2.setAge(25);
		// 1. Add person
		System.out.println(ps.addPerson(p1));
		System.out.println(ps.addPerson(p2));
		// 2. Get person
		System.out.println(ps.getPerson(1));
		//3. Get all persons
		System.out.println(Arrays.asList(ps.getAllPersons()));
		//4. Delete person
		System.out.println(ps.deletePerson(2));
		//5. Again get all persons after deleting person
		System.out.println(Arrays.asList(ps.getAllPersons()));
	}

}
