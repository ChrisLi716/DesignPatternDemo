package com.chris.demo.freetest;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Auther Chris Lee
 * @Date 8/30/2018 11:35
 * @Description
 */
@Data
@AllArgsConstructor
public abstract class Animal {
	private String name;
	
	private int legs;
	
	private int weight;
	
	public abstract void run(int speed, int legs);
	
	public abstract void walk();
	
	public abstract void hunt(String prey);
	
	public void sleep() {
		System.out.println(this.name + " is sleeping");
	}
	
	public void sleep(boolean ingroup) {
		System.out.println(this.name + " is sleeping" + (ingroup ? " in group" : " alone"));
	}
	
}
