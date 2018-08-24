package com.chris.designpattern.template_method_pattern;

/**
 * @Auther Chris Lee
 * @Date 8/24/2018 17:54
 * @Description
 */
public abstract class House {
	
	public void buildHouse() {
		constructRoof();
		constructBase();
		constructWalls();
		constructDoors();
		constructWindows();
		paintHouse();
		decorateHouse();
		
	}
	
	public abstract void decorateHouse();
	
	public abstract void paintHouse();
	
	public abstract void constructDoors();
	
	public abstract void constructWindows();
	
	public abstract void constructWalls();
	
	/**
	 * final implementation of constructing roof - final as all type of house Should build roof in same manner.
	 */
	private final void constructRoof() {
		System.out.println("Roof has been constructed.");
	}
	
	/**
	 * final implementation of constructing base - final as all type of house Should build base/foundation in same manner.
	 */
	private final void constructBase() {
		System.out.println("Base has been constructed.");
	}
	
}
