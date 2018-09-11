/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter10.inherit;

/**
 * 内部类继承
 * @author "liuxj"
 *
 */
public class InheritInner extends WithInner.Inner {
	
	public InheritInner(WithInner outer) {
		outer.super();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WithInner w = new WithInner();
		InheritInner inherit = new InheritInner(w);
		System.out.println(inherit);

	}

}

class WithInner {
	class Inner {
		
	}
}
