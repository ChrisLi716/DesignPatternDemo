package com.chris.designpattern.builder.interfaces.impl;

import com.chris.designpattern.builder.interfaces.Packing;

/**
 * @Auther Chris Lee
 * @Date 10/22/2018 17:54
 * @Description
 */
public class Bottle implements Packing {
	@Override
	public String pack() {
		return "Bottle";
	}
	
	@Override
	public String toString() {
		return "Bottle";
	}
}
