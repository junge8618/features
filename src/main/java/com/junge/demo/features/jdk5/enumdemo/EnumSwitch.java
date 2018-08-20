/**
 * 
 */
package com.junge.demo.features.jdk5.enumdemo;

/**
 * @author "liuxj"
 *
 */
public class EnumSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		selectColor(Color.RED);
		selectColor(Color.GREEN);

	}

	public static void selectColor(Color c) {
		switch (c) {
		case RED:
			System.out.println(c.name());
			break;
		case GREEN:
			System.out.println(c.name());
			break;
		default:
			System.out.println("unsupport color");
		}
	}
}

enum Color {
	RED, GREEN
}
