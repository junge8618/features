/**
 * 
 */
package com.junge.demo.features;

/**
 * 字面常量测试
 * @author liuxj
 *
 */
public class Literals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*int i1 = 0xefffffff;
		System.out.println(i1);
		System.out.println(Integer.toBinaryString(i1));*/
		System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
		System.out.println(Integer.MAX_VALUE * 2);
		System.out.println(Integer.MAX_VALUE * 3);
		System.out.println(Integer.MAX_VALUE * (2 + 1));
		System.out.println(Integer.toBinaryString(-21));
		System.out.println(Integer.toHexString(-21));
		System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.toBinaryString(2147483648L));
		System.out.println(Long.toHexString(Integer.MIN_VALUE));
		System.out.println(Long.toBinaryString(Integer.MAX_VALUE));
		System.out.println(Long.toHexString(Integer.MAX_VALUE));
		
		/*
		System.out.println(Integer.toHexString(Byte.MAX_VALUE));
		System.out.println(Integer.toHexString(Byte.MIN_VALUE));
		
		System.out.println(Integer.toHexString(Character.MAX_VALUE));
		System.out.println(Integer.toHexString(Character.MIN_VALUE));
		
		System.out.println(Integer.toHexString(Short.MAX_VALUE));
		System.out.println(Integer.toHexString(Short.MIN_VALUE));
		
		System.out.println(Integer.toHexString(Integer.MAX_VALUE));
		System.out.println(Integer.toHexString(Integer.MIN_VALUE));
		
		System.out.println(Long.toHexString(Long.MAX_VALUE));
		System.out.println(Long.toHexString(Long.MIN_VALUE));
		
		System.out.println(Float.toHexString(Float.MAX_VALUE));
		System.out.println(Float.toHexString(Float.MIN_VALUE));
		
		System.out.println(Double.toHexString(Double.MAX_VALUE));
		System.out.println(Double.toHexString(Double.MIN_VALUE));*/
		
		int o1 = 0177;
		System.out.println(o1);
		System.out.println(Integer.toBinaryString(o1));
		System.out.println(Integer.toHexString(o1));
		
		System.out.println(Integer.toHexString(16));
		System.out.println(0x10 * 0177);

	}

}
