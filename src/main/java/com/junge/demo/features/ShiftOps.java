/**
 * 
 */
package com.junge.demo.features;

/**
 * 移位操作符
 * 移位操作符只能用来处理整数类型数据。
1）左移位操作符（<<）能按操作符右则指定的位数将操作符左边的向走移动（在低位补0）
2）有符号右移操作符(>>)则按操作符右则指定的位数将操作符左边的操作数向右移动，如果左侧操作数为正数则在高位补0，如果是负数则在高位补1.
3）无符号右移操作符(>>>)不管是正数还是负数，高位都补0
 * @author liuxj
 *
 */
public class ShiftOps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 0x7d;
		int i2 = -0x7d;
		System.out.println("原始数字i:" + Integer.toBinaryString(i));
		System.out.println("原始数字2:" + Integer.toBinaryString(i2));
		System.out.println("原始数字i:" + i);
		System.out.println("原始数字2:" + i2);
		System.out.println("左移位操作符（<<）:" + Integer.toBinaryString(i << 1));
		System.out.println("有符号右移操作符(>>):" + Integer.toBinaryString(i >> 1));
		System.out.println("有符号右移操作符(>>):" + Integer.toBinaryString(i2 >> 1));
		System.out.println("有符号右移操作符(>>):" + (i >> 1));
		System.out.println("有符号右移操作符(>>):" + (i2 >> 1));
		System.out.println("无符号右移操作符(>>>):" + Integer.toBinaryString(i >>> 1));
		System.out.println("无符号右移操作符(>>>):" + Integer.toBinaryString(i2 >>> 1));
		System.out.println("无符号右移操作符(>>>):" + (i >>> 1));
		System.out.println("无符号右移操作符(>>>):" + (i2 >>> 1));
		
		int t = Integer.MAX_VALUE;
		for (int j=0; j<31; j++) {
			t >>>= 1;
			System.out.println(String.format("binarystr:%s,decimalstr:%s", Integer.toBinaryString(t), t));
		}
		
		t = Integer.MAX_VALUE;
		for (int j=0; j<31; j++) {
			t <<= 1;
			System.out.println(String.format("binarystr:%s,decimalstr:%s", Integer.toBinaryString(t), t));
		}
		
		System.out.println(String.format("binarystr:%s,charstr:%s,intvalue:%s", Integer.toBinaryString('a'), 'a', (int)'a'));
	}

}
