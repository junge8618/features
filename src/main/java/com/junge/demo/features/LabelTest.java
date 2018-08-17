/**
 * 
 */
package com.junge.demo.features;

/**
 * java中标签操作（类似goto语句）
 * @author "liuxj"
 *
 */
public class LabelTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("测试开始，在标签前打印");
		label1:
		for(int i=0; i<=10; i++,System.out.println("递增步长打印i=" + i)) {
			System.out.println("外层迭代打印i=" + i);
			for (int j=0; j<=10; j++,System.out.println("递增步长打印j=" + j)) {
				if (j == 2) {
					continue label1;
				}
				System.out.println("内层迭代打印j=" + j);
			}
		}

		System.out.println("测试完成");
	}

}
