package com.chris.demo.clone;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Auther Chris Lee
 * @Date 8/27/2018 12:35
 * @Description
 */
@Data
@AllArgsConstructor
public class Person implements Cloneable {
	
	private String name;
	
	private int income;
	
	private City city;
	
	/**
	 * deep clone of Person by implementing Cloneable interface and override clone() method in every reference type
	 * 
	 * @return the shallow copy of Person
	 * @throws CloneNotSupportedException the object's class does not implement the Cloneable interface
	 */
	public Person deepClone()
		throws CloneNotSupportedException {
		Person personClone = (Person)super.clone();
		personClone.city = this.city.clone();
		return personClone;
	}
	
	/*
	 * shallow clone of Person , in the case of reference types only reference bits gets copied to the new instance
	 *
	 * @return the shallow copy of Person
	 *
	 * @throws CloneNotSupportedException the object's class does not implement the Cloneable interface
	 */
	public Person shallowClone()
		throws CloneNotSupportedException {
		return (Person) super.clone();
	}
	
}
