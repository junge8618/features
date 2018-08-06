/**
 * 
 */
package com.junge.demo.features.jdk5.autobox;

/**
 * 自动装箱测试
 * @author liuxj
 *
 */
public class AutoBoxTest {

	// https://www.cnblogs.com/junge8618/p/9397415.html
	public static void main(String[] args) {
		Integer a1 = 127;
		Integer a2 = 120 + 7;
		System.out.println(a1 == a2);
		
		Integer b1 = 128;
		Integer b2 = 120 + 8;
		System.out.println(b1 == b2);
		
		Integer s1 = 2002;
		short s2 = 2002;
		System.out.println(s1 == s2);
		
		System.out.println(s1 == 2002);
		
		System.out.println(2002 == s1);
	}
}
