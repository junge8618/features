/**
 * 
 */
package com.junge.demo.features;

/**
 * 数学计算
 * @author liuxj
 *
 */
public class MathOps {

	public static void main(String[] args) {
		int a = (int)(9/3.8);
		System.out.println(a);
		
		short b = 3;
		int d = +3;
		long e = 3;
		int x = -d;
		System.out.println(String.format("b=%s,d=%s,e=%s,x=%s", b, d, e, x));
		
		int i=1;
		System.out.println(String.format("i++=%s", i++)); //1
		System.out.println(String.format("++i=%s", ++i)); //3
		System.out.println(String.format("i--=%s", i--)); //3
		System.out.println(String.format("--i=%s", --i)); //1
		
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1 == b2);
		
		Integer i1 = new Integer(47);
		Integer i2 = new Integer(47);
		System.out.println(i1 == i2);
		
		Integer v1 = Integer.valueOf(47);
		Integer v2 = Integer.valueOf(47);
		System.out.println(v1 == v2);
		
		Integer v11 = 47;
		Integer v12 = 47;
		System.out.println(v11 == v12);
	}
}
