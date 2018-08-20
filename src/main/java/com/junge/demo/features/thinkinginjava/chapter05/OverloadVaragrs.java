/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter05;

/**
 * 可变参数重载
 * 
 * @author "liuxj"
 *
 */
public class OverloadVaragrs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		f1(1, 'a', 'b');
//		f1('a', 'b'); // 该行存在编译错误，原因是Character可以自动转换为long类型，在这里编译器不知道调用哪个方法

	}

	public static void f1(long l, Character... chars) {
		System.out.println("first");
	}

	public static void f1(Character... chars) {
		System.out.println("second");
	}
}
