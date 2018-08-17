/**
 * 
 */
package com.junge.demo.features;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
		vampirenum();

	}

	/**
	 * 逆向思维，4位数字的吸血鬼数字只能拆分成两个2位数，因此遍历所有两个两位数相乘的情况，除去不符合的情况不用判断，其他挨个判断即可
	 */
	public static void vampirenum() {
		
		for(int i=10; i<=99; i++) {
			for (int j= i + 1; j<=99; j++) {
				int i_target = i * j;
				if (i_target < 1000 || i_target > 9999) {
					continue;
				}
				
				char[] target_chars = String.valueOf(i_target).toCharArray();
				char[] tmp_chars = String.valueOf(i + "" + j).toCharArray();
				Arrays.sort(target_chars);
				Arrays.sort(tmp_chars);
				if (Arrays.equals(target_chars, tmp_chars)) {
					System.out.println(i_target + "=" + i + "*" + j);
				}
				
			}
		}
		
	}
	
	
}
