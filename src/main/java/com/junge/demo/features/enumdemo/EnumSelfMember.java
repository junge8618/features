/**
 * 
 */
package com.junge.demo.features.enumdemo;

/**
 * @author "liuxj"
 *
 */
public class EnumSelfMember {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Color2.c1.getColor());

	}

}

enum Color2 {
	c1("c1"), c2("c2");
	
	private final String color;
	
	private Color2(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
}
