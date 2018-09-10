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
public interface ClassInInterface2 {

	void print(String str);

	static class Inner2 {
		private ClassInInterface2 i;
		public Inner2(ClassInInterface2 i) {
			this.i = i;
		}
		
		public void printInner(String str) {
			System.out.println("before format Inner2 print");
			i.print(str);
			System.out.println("after format Inner2 print");

		}
	}
}

class SubClass2 implements ClassInInterface2 {

	@Override
	public void print(String str) {
		System.out.println("SubClass1 print " + str);

	}
}
