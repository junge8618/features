/**
 * 
 */
package com.junge.demo.features;

/**
 * 吸血鬼数字
 * 吸血鬼数字是指位数为偶数的数字，可由一对数字相乘而得到，这对数字各包含乘积的一半位数的数字，以两个0结尾的数字是不允许的，第一个数字顺序可以随意，第二个数字顺序不能变。
 * @author "liuxj"
 *
 */
public class VampireNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(vampirenum(4));

	}

	/**
	 * 
	 * @param digitcpa 位数
	 * @return
	 */
	public static String vampirenum(int digitcpa) {
		StringBuilder result = new StringBuilder();
		
		int min = (int)Math.pow(10, digitcpa - 1);
		int max = (int)Math.pow(10, digitcpa);
		System.out.println(min + "," + max);
		
		for (int num=min; num<max; num++) {
			if (isVampireNum(digitcpa, num)) {
				result.append(num).append(",");
			}
		}
		
		return result.toString();
	}
	
	private static boolean isVampireNum(int digitcpa, int num) {
		for (int i=0; i<digitcpa; i++) {
			for(int j=i; j<digitcpa; j++) {
				
			}
		}
		return false;
	}
}
