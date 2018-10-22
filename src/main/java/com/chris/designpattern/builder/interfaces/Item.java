package com.chris.designpattern.builder.interfaces;

/**
 * @Auther Chris Lee
 * @Date 10/22/2018 17:49
 * @Description
 */
public interface Item {
	String name();
	
	Packing packing();
	
	float price();
	
}
