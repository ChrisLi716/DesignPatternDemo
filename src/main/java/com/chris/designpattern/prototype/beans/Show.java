package com.chris.designpattern.prototype.beans;

import com.chris.designpattern.prototype.PrototypeCapable;
import lombok.Data;

/**
 * @Auther Chris Lee
 * @Date 8/27/2018 10:47
 * @Description
 */
@Data
public class Show implements PrototypeCapable {
	
	private String name;
	
	public Show clone()
		throws CloneNotSupportedException {
		System.out.println("Cloning Show object...");
		return (Show)super.clone();
	}
}
