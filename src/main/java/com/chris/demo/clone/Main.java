package com.chris.demo.clone;

/**
 * @Auther Chris Lee
 * @Date 8/27/2018 14:23
 * @Description
 */
public class Main {
	
	public static void main(String[] args)
		throws Exception {
		City city = new City("Dehradun");
		Person person1 = new Person("Naresh", 10000, city);
		Person person2 = person1.shallowClone();
		
		Person person3 = person1.deepClone();
		
		CloneUtils.CompareObjects(person1, person2);
		System.out.println("----------------------");
		CloneUtils.CompareObjects(person1, person3);
		System.out.println("----------------------");
		// upate the content of person1
		person1.setName("Chris");
		city.setName("SZ");
		
		CloneUtils.CompareObjects(person1, person2);
		System.out.println("----------------------");
		CloneUtils.CompareObjects(person1, person3);
	}
	
}
