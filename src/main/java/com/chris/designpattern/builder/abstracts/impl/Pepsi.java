package com.chris.designpattern.builder.abstracts.impl;

import com.chris.designpattern.builder.abstracts.ColdDrink;

/**
 * @Auther Chris Lee
 * @Date 10/22/2018 18:05
 * @Description
 */
public class Pepsi extends ColdDrink {
	@Override
	public String name() {
		return "Pepsi";
	}
	
	@Override
	public float price() {
		return 35.0f;
	}
}
