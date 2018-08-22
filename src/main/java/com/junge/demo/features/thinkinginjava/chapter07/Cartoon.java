/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter07;

/**
 * 继承中基类总是在导出类之前初始化
 * @author "liuxj"
 *
 */
public class Cartoon extends Draw {
	
	public Cartoon() {
		System.out.println("Cartoon construction function");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Cartoon();

	}

}

class Art {
	public Art() {
		System.out.println("Art construction function");
	}
}

class Draw extends Art {
	public Draw() {
		System.out.println("Draw construction function");
	}
}
