package com.chris.designpattern.builder.abstracts.impl;

import com.chris.designpattern.builder.abstracts.Burger;

/**
 * @Auther Chris Lee
 * @Date 10/22/2018 18:02
 * @Description
 */
public class VegBurger extends Burger {
	@Override
	public String name() {
		return "Veg Burger";
	}
	
	@Override
	public float price() {
		return 25.0f;
	}
}
