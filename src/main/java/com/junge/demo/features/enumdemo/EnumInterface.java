/**
 * 
 */
package com.junge.demo.features.enumdemo;

/**
 * 枚举类实现接口 枚举不能继承自定义类，可以实现多个接口
 * 
 * @author "liuxj"
 *
 */
public class EnumInterface {
	public static void main(String[] args) {
		MyEnum.E1.func1();
		MyEnum.E2.func2();
		
		System.out.println(MyEnum.E1.name());
		System.out.println(MyEnum.E2.ordinal());
	}
}

enum MyEnum implements MyInterface1, MyInterface2 {
	E1, E2;
	
	private MyEnum() {
		
	}

	@Override
	public void func2() {
		System.out.println("func2");
	}

	@Override
	public void func1() {
		System.out.println("func1");
	}

}

class MyClass {

}

interface MyInterface1 {
	void func1();
}

interface MyInterface2 {
	void func2();
}
