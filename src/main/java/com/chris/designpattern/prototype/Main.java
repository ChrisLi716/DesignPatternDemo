package com.chris.designpattern.prototype;

/**
 * @Auther Chris Lee
 * @Date 8/27/2018 11:08
 * @Description
 */
public class Main {
	
	public static void main(String[] args) {
		try {
			String moviePrototype = PrototypeFactory.getInstance(MediaType.Movie.getValue()).toString();
			System.out.println(moviePrototype);
			String albumPrototype = PrototypeFactory.getInstance(MediaType.Album.getValue()).toString();
			System.out.println(albumPrototype);
			String showPrototype = PrototypeFactory.getInstance(MediaType.Show.getValue()).toString();
			System.out.println(showPrototype);
		}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
}
