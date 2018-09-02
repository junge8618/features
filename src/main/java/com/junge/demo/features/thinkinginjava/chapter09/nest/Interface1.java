/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter09.nest;

/**
 * 描述类功能
 * @author "liuxj"
 * @date 2018年9月2日
 */
public interface Interface1 {

	interface I2 {
		void fun2();
	}
	
	public interface I3 {
		void func3();
	}
	
	/*private interface I4 {
		void func4();
	}
	
	protected interface I5 {
		void func5();
	}*/
	
	void fun();
}
