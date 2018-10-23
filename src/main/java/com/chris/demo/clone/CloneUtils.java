package com.chris.demo.clone;

/**
 * @Auther Chris Lee
 * @Date 10/23/2018 11:38
 * @Description
 */
public class CloneUtils {
	
	public static void CompareObjects(Person person1, Person person2) {
		System.out.println("-->" + person1.toString());
		System.out.println("-->" + person2.toString());
		
		if (person1 == person2) {
			// Evaluate false, person1 and person2 are the copy of each other
			// but both are different objects and holds different heap memory
			System.out.println("Both person1 and person2 holds same object");
		}
		
		if (person1.equals(person2)) {
			// Evaluate true, person1 and person2 are equal and have same content
			System.out.println("Both person1 and person2 are equal and have same content");
		}
		
		if (person1.getCity() == person2.getCity()) {
			System.out.println("Both person1 and person2 have same city object");
		}
	}
}
