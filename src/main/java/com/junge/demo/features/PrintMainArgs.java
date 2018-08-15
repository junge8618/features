/**
 * 
 */
package com.junge.demo.features;

/**
 * @author "liuxj"
 *
 */
public class PrintMainArgs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (null != args) {
			for (String arg : args) {
				System.out.println(arg);
			}
		}

	}

}
