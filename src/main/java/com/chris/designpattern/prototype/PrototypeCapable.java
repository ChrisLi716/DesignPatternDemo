package com.chris.designpattern.prototype;

/**
 * @Auther Chris Lee
 * @Date 8/27/2018 10:37
 * @Description
 */
public interface PrototypeCapable extends Cloneable {
	PrototypeCapable clone()
		throws CloneNotSupportedException;
}
