package com.chris.designpattern.builder;

import com.chris.designpattern.builder.interfaces.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther Chris Lee
 * @Date 10/22/2018 18:07
 * @Description
 */
public class Meal {
	private List<Item> itemList = new ArrayList<>();
	
	void addItem(Item item) {
		this.itemList.add(item);
	}
	
	float getTotalFee() {
		float totalFee = 0.0f;
		for (Item item : itemList) {
			totalFee += item.price();
		}
		return totalFee;
	}
	
	void showItems() {
		for (Item item : itemList) {
			int sequence = 1;
			System.out.println(sequence + ": " + item.name());
			System.out.println(++sequence + ": " + item.packing());
			System.out.println("fee: " + item.price());
		}
	}
}
