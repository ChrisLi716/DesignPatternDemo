package com.chris.designpattern.factory;

/**
 * @Auther Chris Lee
 * @Date 8/29/2018 15:47
 * @Description
 */
public class LuxuryCar extends Car {
	
	LuxuryCar()
	{
		super(CarType.LUXURY);
		construct();
	}
	
	@Override
	protected void construct() {
		System.out.println("building the lexury car");
	}
}
