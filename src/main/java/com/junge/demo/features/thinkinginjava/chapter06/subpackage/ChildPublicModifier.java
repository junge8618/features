/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter06.subpackage;

import com.junge.demo.features.thinkinginjava.chapter06.PublicModifier;

/**
 * @author "liuxj"
 *
 */
public class ChildPublicModifier extends PublicModifier {

	public static void main(String[] args) {
		ChildPublicModifier c = new ChildPublicModifier();
		c.func1();
	}

	public void func1() {
		super.protectedfun();
	}
}
