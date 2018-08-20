/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter05;

/**
 * @author "liuxj"
 *
 */
public class NoneStaticMemInit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Mugs();
		new Mugs(1);

	}

}

class Mug {
	Mug(int market) {
		System.out.println("Mug(" + market + ")");
	}
	
	void f(int market) {
		System.out.println("f(" + market + ")");
	}
}

class Mugs {
	Mug mug1;
	Mug mug2;
	
	{
		mug1 = new Mug(1);
		mug2 = new Mug(2);
		System.out.println("none static member init...");
	}
	
	public Mugs() {
		System.out.println("Mugs");
	}
	
	public Mugs(int market) {
		System.out.println("Mugs(int)");
	}
}