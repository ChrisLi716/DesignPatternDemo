package com.chris.designpattern.builder;

/**
 * @Auther Chris Lee
 * @Date 10/22/2018 18:12
 * @Description
 */
public class Main {
	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getTotalFee());
		
		System.out.println("===================================");


		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("Non-Veg Meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getTotalFee());
	}
}
