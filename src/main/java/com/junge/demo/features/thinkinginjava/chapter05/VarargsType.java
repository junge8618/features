/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter05;

/**
 * 可变参数类型
 * 
 * @author "liuxj"
 *
 */
public class VarargsType {

	/**
	 * @param args
	 */
	public static void main(String... args) {
		f1('a');
		f1();
		
		g1(1);
		g1(new int[]{1,2,3,4,5});
		g1();
		
		g2(1);
		g2();

	}

	public static void f1(Character... characters) {
		System.out.print(characters.getClass());
		//System.out.println(characters.getClass().getName());
		System.out.println(" length " + characters.length);
	}

	public static void g1(int... is) {
		System.out.print(is.getClass());
		//System.out.println(is.getClass().getName());
		System.out.println(" length " + is.length);
	}
	
	public static void g2(Integer... is) {
		System.out.print(is.getClass());
		//System.out.println(is.getClass().getName());
		System.out.println(" length " + is.length);
	}
}
