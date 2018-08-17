/**
 * 
 */
package com.junge.demo.features;

import java.util.Random;

/**
 * @author "liuxj"
 *
 */
public class SwitchTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Random rand = new Random(47);
		for (int i=0; i<100; i++) {
			int ch = rand.nextInt(26) + 'a';
			switchtest1((char)ch);
		}

	}

	public static void switchtest1(char ch) {
		switch (ch) {
		case 'a':
			System.out.println('a');
			break;
		case 'b':
			System.out.println('b');
			break;
		case 'c':
			System.out.println('c');
			break;
		default:
			System.out.println("other char " + ch);
			break;
		}
	}

}
