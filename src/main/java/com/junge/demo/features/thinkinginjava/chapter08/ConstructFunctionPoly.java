/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter08;

/**
 * 构造函数调用多态方法
 * 
 * @author "liuxj"
 *
 */
public class ConstructFunctionPoly {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Export(1);

	}

}

class Base {

	public Base() {
		System.out.println("before base");
		draw();
		System.out.println("after base");
	}

	public void draw() {
		System.out.println("Base.draw()...");
	}
}

class Export extends Base {

	private int i;

	public Export(int i) {
		this.i = i;
		System.out.println("before Export");
		draw();
		System.out.println("after Export");
	}

	public void draw() {
		System.out.println("Export.draw()... and i=" + i);
	}
}