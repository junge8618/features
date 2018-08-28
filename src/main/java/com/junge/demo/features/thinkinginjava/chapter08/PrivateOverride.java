/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter08;

/**
 * 覆盖父类私有方法
 * @author "liuxj"
 *
 */
public class PrivateOverride {
	
	private void f() {
		System.out.println("private function");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrivateOverride p = new Derived();
		p.f();

	}

}

class Derived extends PrivateOverride {
	// @Override
	public void f() {
		System.out.println("public function");
	}
}
