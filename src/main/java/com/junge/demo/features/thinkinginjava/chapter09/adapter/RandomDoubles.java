/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter09.adapter;

import java.util.Random;

/**
 * 描述类功能 我们可以在任何现有类之上添加新的接口，所以这意味着让方法接受接口类型，是一种让任何类都可以对该方法进行适配的方式。
 * 
 * @author "liuxj"
 * @date 2018年9月2日
 */
public class RandomDoubles {
	private static Random rand = new Random(47);

	public double next() {
		return rand.nextDouble();
	}

	public static void main(String[] args) {
		RandomDoubles rd = new RandomDoubles();
		for (int i = 0; i < 7; i++) {
			System.out.println(rd.next() + " ");
		}
	}
}
