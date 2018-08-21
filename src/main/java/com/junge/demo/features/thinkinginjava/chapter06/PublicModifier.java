/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter06;

/**
 * 公共访问权限
 * @author "liuxj"
 *
 */
public class PublicModifier {
	
	public static void main(String[] args) {
		PublicModifier p = new PublicModifier();
		p.privatefun();
	}

	public void pubfun() {
		System.out.println("pubfun");
	}
	
	protected void protectedfun() {
		System.out.println("protectedfun");
	}
	
	void packfun() {
		System.out.println("packfun");
	}
	
	private void privatefun() {
		System.out.println("privatefun");
	}

}
