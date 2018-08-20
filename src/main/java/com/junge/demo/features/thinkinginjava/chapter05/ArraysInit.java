/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter05;

import java.util.Arrays;

/**
 * 数组初始化
 * @author "liuxj"
 *
 */
public class ArraysInit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a1 = {1,2,3,4,5,6,};
		int[] a2 = new int[]{1,2,3,4,5,6,};
		int[] a3 = new int[6];
		
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		System.out.println(Arrays.toString(a3));

	}

}
