package com.chris.designpattern.builder;

import com.chris.designpattern.builder.abstracts.impl.ChickenBurger;
import com.chris.designpattern.builder.abstracts.impl.Coke;
import com.chris.designpattern.builder.abstracts.impl.Pepsi;
import com.chris.designpattern.builder.abstracts.impl.VegBurger;

/**
 * @Auther Chris Lee
 * @Date 10/22/2018 18:11
 * @Description
 */
public class MealBuilder {
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	
	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
