/**
 * 
 */
package com.junge.demo.features;

/**
 * 斐波拉契数字
 * 前2个数之和等于第三个数
 * @author "liuxj"
 *
 */
public class FibonacciNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//fibonacci(10);

		for (int i=1; i<=10; i++) {
			System.out.println(fib(i));
		}
	}
	
	public static void fibonacci(int num) {
		int firstnum = 1;
		int secondnum = 1;
		int thirdnum = 2;
		
		int count = 2;
		System.out.println(firstnum);
		System.out.println(secondnum);
		while(true) {
			if (firstnum + secondnum == thirdnum) {
				System.out.println(thirdnum);
				firstnum = secondnum;
				secondnum = thirdnum;
				
				count ++;
			}
			
			if (count == num) {
				break;
			}
			
			thirdnum ++;
		}
	}
	
	public static int fib(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		return fib(n - 1) + fib(n - 2);
	}

}
