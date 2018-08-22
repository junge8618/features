/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter07;

/**
 * @author "liuxj"
 *
 */
public class ExportPrint extends PrintBase {

	public void print(MyObject f) {
		System.out.println("print(MyObject)");
	}
	
	public static void main(String[] args) {
		ExportPrint print = new ExportPrint();
		print.print('c');
		print.print(3);
		print.print(3.0f);
		print.print(new MyObject());
	}
}

class MyObject {
	
}