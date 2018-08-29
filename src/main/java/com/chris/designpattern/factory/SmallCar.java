package com.chris.designpattern.factory;

/**
 * @Auther Chris Lee
 * @Date 8/29/2018 15:48
 * @Description
 */
public class SmallCar extends Car {
	SmallCar()
	{
		super(CarType.SMALL);
		construct();
	}
	
	@Override
	protected void construct() {
		System.out.println("building small car");
	}
}
