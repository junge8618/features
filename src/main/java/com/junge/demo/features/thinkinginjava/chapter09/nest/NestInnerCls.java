/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter09.nest;

/**
 * 接口中嵌套内部类
 * @author "liuxj"
 * @date 2018年9月2日
 */
public class NestInnerCls {

	/**
	 * 描述方法功能和使用场景
	 * @author "liuxj"
	 * @date 2018年9月2日
	 * @param args
	 */
	public static void main(String[] args) {
		I1 i1 = new I1.Inner();
		I1.Inner.staticFunc(i1);
		
		I1.Inner.staticFunc(new Outter());
	}
}

interface I1 {
	void func();
	
	class Inner implements I1 {
		
		public static void staticFunc(I1 i1) {
			i1.func();
		}

		@Override
		public void func() {
			System.out.println("inner func");
		}
	}
}

class Outter implements I1 {

	@Override
	public void func() {
		System.out.println("outter func");
	}
}
