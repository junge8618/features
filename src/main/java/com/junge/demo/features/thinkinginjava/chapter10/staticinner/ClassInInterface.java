/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter10.staticinner;

/**
 * 接口中定义嵌套类
 * 
 * @author "liuxj"
 *
 */
public interface ClassInInterface {

	void print(String str);

	static class Inner2 {
		public void print(String str) {
			System.out.println("before format Inner2 print : " + str);

		}
	}
}

class SubClass1 implements ClassInInterface {

	private Inner2 inner2 = new Inner2();

	@Override
	public void print(String str) {
		inner2.print(str);

	}
}
