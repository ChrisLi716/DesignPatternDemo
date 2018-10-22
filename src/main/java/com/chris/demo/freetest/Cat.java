package com.chris.demo.freetest;

/**
 * @Auther Chris Lee
 * @Date 8/30/2018 12:08
 * @Description
 */
public class Cat extends Animal {
	
	public Cat(String name, int legs, int weight)
	{
		super(name, legs, weight);
	}
	
	@Override
	public void run(int speed, int legs) {
		System.out.println(super.getName() + " is running with " + speed + "KM per hour with " + legs + " legs.");
	}
	
	public void run() {
		System.out.println(super.getName() + " is running");
	}
	
	@Override
	public void walk() {
		System.out.println(super.getName() + " is walking");
	}
	
	@Override
	public void hunt(String prey) {
		System.out.println(super.getName() + " is hunting " + prey);
		
	}
}
