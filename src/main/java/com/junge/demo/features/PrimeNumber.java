/**
 * 
 */
package com.junge.demo.features;

/**
 * 打印10000以内的素数
 * 素数只能被自身和1整除
 * @author "liuxj"
 *
 */
public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 10000;
		for (int i=1; i<=num; i++) {
			boolean isPrimeNum = true;
			for (int j=2; j<i; j++) {
				if (0 == i%j) {
					isPrimeNum = false;
					break;
				}
			}
			
			if (isPrimeNum) {
				System.out.println("素数:" + i);
			}
		}

	}

}
