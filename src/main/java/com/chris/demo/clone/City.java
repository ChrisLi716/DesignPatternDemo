package com.chris.demo.clone;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Auther Chris Lee
 * @Date 8/27/2018 12:37
 * @Description
 */
@Data
@AllArgsConstructor
public class City implements Cloneable {
	private String name;
	
	public City clone()
		throws CloneNotSupportedException {
		return (City)super.clone();
	}
}
