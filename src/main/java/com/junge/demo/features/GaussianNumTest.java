/**
 * 
 */
package com.junge.demo.features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 生成正态分布数字
 * 参考文档:
 * http://www.cnblogs.com/zztt/p/4025207.html
 * @author liuxj
 *
 */
public class GaussianNumTest {

	/**
	 * 如我们要获得均值为180，要68.26%左右的NPC身高都在[170,190]之内，即1个标准差范围内，因此标准差为10, 可以通过getNumberInNormalDistribution(180,10) 调用，我们实验1000000次
	 * @param args
	 */
	public static void main(String[] args) {
		int count = 1000000;
		
		// key为分布的值，value为出现的次数
		Map<Integer, Integer> data = new HashMap<Integer, Integer>();
		for (int i=0; i<count; i++) {
			int num = getNumberInNormalDistribution(180,10);
			if (data.containsKey(num)) {
				data.put(num, data.get(num) + 1);
				continue;
			}
			
			data.put(num, 1);
		}
		
		List<Integer> keys = new ArrayList<Integer>(data.keySet());
		Collections.sort(keys);
		for (int key : keys) {
			System.out.println(key + ":" + data.get(key));
		}
	}

	public static double randomNormalDistribution() {
		double u = 0.0, v = 0.0, w = 0.0, c = 0.0;
		do {
			// 获得两个（-1,1）的独立随机变量
			u = Math.random() * 2 - 1.0;
			v = Math.random() * 2 - 1.0;
			w = u * u + v * v;
		} while (w == 0.0 || w >= 1.0);
		// 这里就是 Box-Muller转换
		c = Math.sqrt((-2 * Math.log(w)) / w);
		// 返回2个标准正态分布的随机数，封装进一个数组返回
		// 当然，因为这个函数运行较快，也可以扔掉一个
		// return [u*c,v*c];
		return u * c;
	}
	
	public static int getNumberInNormalDistribution(int mean, int std_dev) {
		return mean + (int)(randomNormalDistribution() * std_dev);
	}
}
