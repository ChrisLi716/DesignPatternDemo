package com.chris.designpattern.builder.interfaces.impl;

import com.chris.designpattern.builder.interfaces.Packing;

/**
 * @Auther Chris Lee
 * @Date 10/22/2018 17:54
 * @Description
 */
public class Wrapper implements Packing {
	@Override
	public String pack() {
		return "Wrapper";
	}
	
	@Override
	public String toString() {
		return "Wrapper";
	}
}
