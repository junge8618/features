/**
 * 
 */
package com.junge.demo.features;

/**
 * 按位操作
 * 按位与操作符（&）：都为1则结果为1，否则为0
按位或操作符（|）：只要有一个为1则结果为1，都为0时结果才是0
按位异或操作符（^）:相同为0，相异为1
按位非操作符（~）:取反操作，是属于一元操作符
按位操作符与等号联合使用：&=，|=，^=，一元操作符不可以与等号联合使用
 * @author liuxj
 *
 */
public class PositionalOps {
	
	public static void main(String[] args) {
		int i1 = 0x72;
		int i2 = 0x73;
		System.out.println("i1原始二进制：" + Integer.toBinaryString(i1));
		System.out.println("i2原始二进制：" + Integer.toBinaryString(i2));
		System.out.println("按位与操作符（&）：" + Integer.toBinaryString(i1 & i2));
		System.out.println("按位或操作符（|）：" + Integer.toBinaryString(i1 | i2));
		System.out.println("按位异或操作符（^）：" + Integer.toBinaryString(i1 ^ i2));
		System.out.println("按位非操作符（~）:" + Integer.toBinaryString(~i1));
		System.out.println("i1原始二进制：" + Integer.toBinaryString(i1));
		
		i1 &= i2;
		System.out.println("i1 &= i2:" + Integer.toBinaryString(~i1));
		i1 |= i2;
		System.out.println("i1 |= i2:" + Integer.toBinaryString(~i1));
		i1 ^= i2;
		System.out.println("i1 ^= i2:" + Integer.toBinaryString(~i1));
	}

}
