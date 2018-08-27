package com.chris.designpattern.prototype.beans;

import com.chris.designpattern.prototype.PrototypeCapable;
import lombok.Data;

/**
 * @Auther Chris Lee
 * @Date 8/27/2018 10:39
 * @Description
 */
@Data
public class Movie implements PrototypeCapable {
	private String name;
	
	public Movie clone()
		throws CloneNotSupportedException {
		System.out.println("Cloning movie object...");
		return (Movie)super.clone();
	}
	
}
