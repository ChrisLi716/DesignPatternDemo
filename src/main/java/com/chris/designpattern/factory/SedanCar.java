package com.chris.designpattern.factory;

/**
 * @Auther Chris Lee
 * @Date 8/29/2018 15:50
 * @Description
 */
public class SedanCar extends Car {
	SedanCar()
	{
		super(CarType.SEDAN);
		construct();
	}
	
	@Override
	protected void construct() {
		System.out.println("building sedan car");
	}
}
