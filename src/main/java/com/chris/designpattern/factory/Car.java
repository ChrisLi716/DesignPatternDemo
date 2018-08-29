package com.chris.designpattern.factory;

import lombok.Data;

/**
 * @Auther Chris Lee
 * @Date 8/29/2018 15:37
 * @Description
 */
@Data
public abstract class Car {
	
	private CarType model;
	
	Car(CarType model)
	{
		this.model = model;
		
	}
	
	protected abstract void construct();
	
}
