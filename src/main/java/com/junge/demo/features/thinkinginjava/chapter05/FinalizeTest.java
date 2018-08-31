/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter05;

import java.util.concurrent.TimeUnit;

/**
 * 描述类功能
 * @author "liuxj"
 * @date 2018年8月19日
 */
public class FinalizeTest {

	/**
	 * 描述方法功能和使用场景
	 * @author "liuxj"
	 * @date 2018年8月19日
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i=0; i<10000000; i++) {
			new FinalizeTest();
			
			if (i%1000000 == 0) {
				System.gc();
			}
		}
		
		System.gc();
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("invoke finalize...");
	}

}
