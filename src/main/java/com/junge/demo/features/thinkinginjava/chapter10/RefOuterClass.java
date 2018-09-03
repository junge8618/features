/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter10;

/**
 * 在内部类对象中声明对外部类对象的引用，可以使用OuterClassName.this
 * 在创建外部类对象之前不能创建内部类（非静态内部类），因为内部类对象都会引用创建它的外部类对象，如果要创建内部类对象，可以使用语法:外部类对象名.new InnerClassName()。在这里不需要指明外部类类名。
 * @author "liuxj"
 *
 */
public class RefOuterClass {

	private int i = 1;
	
	public void printI() {
		System.out.println("RefOuterClass i = " + i);
	}
	
	class Inner {
		RefOuterClass getRefOuterClass() {
			return RefOuterClass.this;
		}
	}
	
	public static void main(String[] args) {
		RefOuterClass outer = new RefOuterClass();
		RefOuterClass.Inner inner = outer.new Inner();
		inner.getRefOuterClass().printI();
	}
}
