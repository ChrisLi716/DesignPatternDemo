package com.chris.designpattern.factory;

/**
 * @Auther Chris Lee
 * @Date 8/29/2018 15:54
 * @Description
 */
public class Main {
	public static void main(String[] args) {
		System.out.println(CarFactory.buildCar(CarType.SEDAN));
		System.out.println(CarFactory.buildCar(CarType.LUXURY));
		System.out.println(CarFactory.buildCar(CarType.SMALL));
	}
}
