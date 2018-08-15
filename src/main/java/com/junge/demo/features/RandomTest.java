/**
 * 
 */
package com.junge.demo.features;

import java.util.Random;

/**
 * 随机数测试
 * @author liuxj
 *
 */
public class RandomTest {

	public static void main(String[] args) {
		//Random r = new Random(47);
		Random r = new Random();
		int i, j, k;
		
		j = r.nextInt(100) + 1;
		k = r.nextInt(100) + 1;
		
		i = j + k;
		System.out.println(String.format("j=%s,k=%s,j+k=%s", j, k, i));
		System.out.println(String.format("s.nextLong=%s", r.nextLong()));
		System.out.println(String.format("s.nextBoolean=%s", r.nextBoolean()));
		System.out.println(String.format("s.nextFloat=%s", r.nextFloat()));
		System.out.println(String.format("s.nextDouble=%s", r.nextDouble()));
		System.out.println(String.format("s.nextGaussian=%s", r.nextGaussian() * 10));
		System.out.println(String.format("s.nextGaussian=%s", r.nextGaussian() * 10));
	}
	
	
}
