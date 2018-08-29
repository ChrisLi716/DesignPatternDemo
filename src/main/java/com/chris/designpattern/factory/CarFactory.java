package com.chris.designpattern.factory;

/**
 * @Auther Chris Lee
 * @Date 8/29/2018 15:51
 * @Description
 */
public class CarFactory {
	
	public static Car buildCar(CarType model) {
		Car car = null;
		switch (model) {
			case SMALL:
				car = new SmallCar();
				break;
			case SEDAN:
				car = new SedanCar();
				break;
			case LUXURY:
				car = new LuxuryCar();
				break;
		}
		return car;
	}
	
}
