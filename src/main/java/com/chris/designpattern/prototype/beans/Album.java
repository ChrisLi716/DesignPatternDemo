package com.chris.designpattern.prototype.beans;

import com.chris.designpattern.prototype.PrototypeCapable;
import lombok.Data;

/**
 * @Auther Chris Lee
 * @Date 8/27/2018 10:42
 * @Description
 */
@Data
public class Album implements PrototypeCapable {
	private String name;
	
	public Album clone()
		throws CloneNotSupportedException {
		System.out.println("Cloning Album object...");
		return (Album)super.clone();
	}
	
}
