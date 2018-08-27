package com.chris.designpattern.prototype;

/**
 * @Auther Chris Lee
 * @Date 8/27/2018 10:51
 * @Description
 */
public enum MediaType
{
	Movie("movie"), Album("album"), Show("show");
	
	private String value;
	
	MediaType(String value)
	{
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
}
