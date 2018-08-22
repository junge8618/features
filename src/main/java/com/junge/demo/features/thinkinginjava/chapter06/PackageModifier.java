/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter06;

/**
 * 包级访问权限
 * @author "liuxj"
 *
 */
class PackageModifier {
	
	public static int count = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("PackageModifor");
		
		PackageModifier p = new PackageModifier();
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
