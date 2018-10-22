package com.chris.designpattern.builder.abstracts;

import com.chris.designpattern.builder.interfaces.Item;
import com.chris.designpattern.builder.interfaces.Packing;
import com.chris.designpattern.builder.interfaces.impl.Wrapper;

/**
 * @Auther Chris Lee
 * @Date 10/22/2018 17:56
 * @Description
 */
public abstract class Burger implements Item {
	
	@Override
	public Packing packing() {
		return new Wrapper();
	}
	
	@Override
	public abstract float price();
}
