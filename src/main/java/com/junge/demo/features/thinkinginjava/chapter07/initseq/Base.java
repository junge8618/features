/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter07.initseq;

/**
 * @author "liuxj"
 *
 */
public class Base {

	private int i = 9;
	
	protected int j;
	
	int h = printInit("Base.h initialized");
	
	Base() {
		System.out.println("i = " + i + ", j = " + j);
		j = 39;
	}
	
	static int x = printInit("static Base.x initialized");
	
	static int printInit(String s) {
		System.out.println(s);
		return 9;
	}
}
