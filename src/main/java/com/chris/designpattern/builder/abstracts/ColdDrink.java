package com.chris.designpattern.builder.abstracts;

import com.chris.designpattern.builder.interfaces.Item;
import com.chris.designpattern.builder.interfaces.Packing;
import com.chris.designpattern.builder.interfaces.impl.Bottle;

/**
 * @Auther Chris Lee
 * @Date 10/22/2018 18:00
 * @Description
 */
public abstract class ColdDrink implements Item {
	@Override
	public Packing packing() {
		return new Bottle();
	}
	
	@Override
	public abstract float price();
}
