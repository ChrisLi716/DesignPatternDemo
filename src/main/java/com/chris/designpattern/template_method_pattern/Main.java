package com.chris.designpattern.template_method_pattern;

/**
 * @Auther Chris Lee
 * @Date 8/24/2018 17:59
 * @Description
 */
public class Main {
	
	public static void main(String[] args) {
		House house = new ConcreteWallHouse();
		house.buildHouse();
		System.out.println("=============================");
		house = new GlassWallHouse();
		house.buildHouse();
	}
}
