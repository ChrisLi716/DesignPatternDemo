package com.chris.designpattern.builder.abstracts.impl;

import com.chris.designpattern.builder.abstracts.ColdDrink;

/**
 * @Auther Chris Lee
 * @Date 10/22/2018 18:04
 * @Description
 */
public class Coke extends ColdDrink {
	@Override
	public String name() {
		return "Coke";
	}
	
	@Override
	public float price() {
		return 30.0f;
	}
}
