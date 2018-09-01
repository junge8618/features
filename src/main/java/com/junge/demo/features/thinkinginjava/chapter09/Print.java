/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter09;

/**
 * 构造器初始化顺序
 * 1.把所有类的成员初始化为0
 * 2.调用基类的构造方法
 * 3.初始化成员变量
 * 4.调用导出类的构造方法
 * @author "liuxj"
 * @date 2018年9月1日
 */
public class Print extends BasePrint {
	
	private int i = 1;

	/**
	 * 描述方法功能和使用场景
	 * @author "liuxj"
	 * @date 2018年9月1日
	 * @param args
	 */
	public static void main(String[] args) {
		new Print();

	}

	@Override
	public void print() {
		System.out.println("print i=" + i);
		
	}

}

abstract class BasePrint {
	public BasePrint() {
		print();
	}
	public abstract void print();
}
