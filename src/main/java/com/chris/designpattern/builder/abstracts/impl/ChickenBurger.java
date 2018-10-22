package com.chris.designpattern.builder.abstracts.impl;

import com.chris.designpattern.builder.abstracts.Burger;

/**
 * @Auther Chris Lee
 * @Date 10/22/2018 18:03
 * @Description
 */
public class ChickenBurger extends Burger {
	@Override
	public String name() {
		return "Chicken Burger ";
	}
	
	@Override
	public float price() {
		return 50.5f;
	}
}
