/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter06;

/**
 * 同包访问
 * @author "liuxj"
 *
 */
public class SamePackageMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PublicModifier pub = new PublicModifier();
		pub.pubfun();
		pub.protectedfun();
		pub.packfun();
		
		PackageModifier pack = new PackageModifier();
		pack.pubfun();
		pack.protectedfun();
		pack.packfun();

	}

}
