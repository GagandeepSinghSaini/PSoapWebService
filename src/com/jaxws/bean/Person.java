/**
 * 
 */
package com.jaxws.bean;

import java.io.Serializable;

/**
 * @author Priyanka Dhiman
 *
 */
public class Person implements Serializable {
	private String name;
	private int id;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	@Override
	public String toString() {
		return id+":"+name+":"+age;
	}

}
