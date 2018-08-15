/**
 * 
 */
package com.junge.demo.features;

/**
 * @author "liuxj"
 *
 */
public class SystemPropertiesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.getProperties().list(System.out);
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("java.library.path"));
	}

}
