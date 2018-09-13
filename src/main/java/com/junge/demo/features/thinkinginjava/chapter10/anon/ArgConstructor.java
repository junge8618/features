/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter10.anon;

/**
 * 匿名类：有参构造方法 描述类功能
 * 
 * @author "liuxj"
 * @date 2018年9月9日
 */
public class ArgConstructor {

	public void print(String name) {
		Base base = new Base(name) {

			@Override
			public void printName() {
				System.out.println(getName());

			}
		};

		base.printName();
	}
	
	public static void main(String[] args) {
		ArgConstructor a = new ArgConstructor();
		a.print("zhangsan");
	}
}
