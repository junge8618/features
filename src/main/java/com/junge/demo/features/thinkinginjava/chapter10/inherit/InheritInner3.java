/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter10.inherit;

/**
 * 内部类继承
 * @author "liuxj"
 *
 */
public class InheritInner3 extends WithInner3{
	
	class InheritInner4 extends WithInner3.Inner3 {
		public InheritInner4(String name) {
			super(name);
		}

	
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InheritInner3 inherit = new InheritInner3();
		InheritInner3.InheritInner4 inner4 = inherit.new InheritInner4("zhangsan");
		System.out.println(inner4);

	}

}

class WithInner3 {
	class Inner3 {
		private String name;
		public Inner3(String name) {
			this.name = name;
			System.out.println(this.name);
		}
		
	}
}
