/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter07;

import java.util.Random;

/**
 * final作用在基本数据类型上，则说明该基本数据类型的字面量值不能修改；如果作用在对象或者数组上，则说明这个引用不能修改，但具体对象的值可以修改。final一般和static关键字一起使用，定义为全局唯一的常量。
 * @author "liuxj"
 *
 */
public class FinalData {
	
	final int i = 1;
	static final int I2 = 2;
	
	private static final Random rand = new Random();
	final int i2 = rand.nextInt();
	static final int I3 = rand.nextInt();
	
	final InnerFinalData data1 = new InnerFinalData();
	static final InnerFinalData DATA2 = new InnerFinalData(); 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FinalData data1 = new FinalData();
		FinalData data2 = new FinalData();
		System.out.println(data1.i);
		System.out.println(FinalData.I2);
		System.out.println(data1.i2);
		System.out.println(FinalData.I3);
		System.out.println(data1.data1);
		//System.out.println(data1.data1.i++);
		//System.out.println(data1.data1.I2++);
		System.out.println(FinalData.DATA2);
		
		System.out.println();
		System.out.println(data2.i);
		System.out.println(data2.i2);
		System.out.println(data2.data1);
		
		for (int i=0; i<data2.data1.a.length; i++) {
			data2.data1.a[i] = data2.data1.a[i] + 1;
		}
		
		for (int i=0; i<data2.data1.a.length; i++) {
			System.out.print(data2.data1.a[i]);
		}
		
		// data2.data1.a = new int[]{2,3,4,5};

	}

}

class InnerFinalData {
	final int i = 0;
	static final int I2 = 1;
	
	final int[] a = new int[]{1,2,3,4};
	
	private final int i2;
	
	public InnerFinalData() {
		i2 = 3;
		System.out.println(i2);
	}
}
