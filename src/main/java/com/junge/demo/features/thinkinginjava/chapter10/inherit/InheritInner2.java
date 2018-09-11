/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter10.inherit;

/**
 * 内部类继承
 * @author "liuxj"
 *
 */
public class InheritInner2 {
	
	class InheritInner3 extends WithInner2.Inner2 {
		public InheritInner3(WithInner2 withInner2, String name) {
			withInner2.super(name);
		}

	
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WithInner2 w = new WithInner2();
		InheritInner2 inherit = new InheritInner2();
		InheritInner2.InheritInner3 inner3 = inherit.new InheritInner3(w, "zhangsan");
		System.out.println(inner3);

	}

}

class WithInner2 {
	class Inner2 {
		private String name;
		public Inner2(String name) {
			this.name = name;
			System.out.println(this.name);
		}
		
	}
}
