package com.chris.designpattern.prototype;

import com.chris.designpattern.prototype.beans.Album;
import com.chris.designpattern.prototype.beans.Movie;
import com.chris.designpattern.prototype.beans.Show;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther Chris Lee
 * @Date 8/27/2018 10:50
 * @Description
 */
class PrototypeFactory {
	
	private static Map<String, PrototypeCapable> prototypes = new HashMap<>();
	
	static {
		prototypes.put(MediaType.Movie.getValue(), new Movie());
		prototypes.put(MediaType.Album.getValue(), new Album());
		prototypes.put(MediaType.Show.getValue(), new Show());
	}
	
	static PrototypeCapable getInstance(final String s)
		throws CloneNotSupportedException {
		return prototypes.get(s).clone();
	}
	
}
