/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter05;

/**
 * 基本类型重载
 * @author "liuxj"
 * @date 2018年8月18日
 */
public class PrimitiverOverloading {

	/**
	 * 描述方法功能和使用场景
	 * @author "liuxj"
	 * @date 2018年8月18日
	 * @param args
	 */
	public static void main(String[] args) {
		PrimitiverOverloading test = new PrimitiverOverloading();
		test.constValTest();
		test.charTest();
		test.byteTest();
		test.shortTest();
		test.intTest();
		test.longTest();
		test.floatTest();
		test.doubleTest();

	}
	
	private void constValTest() {
		System.out.println("5: ");
		f1(5);
		f2(5);
		f3(5);
		f4(5);
		f5(5);
		f6(5);
		f7(5);
		System.out.println();
	}
	
	private void charTest() {
		System.out.println("char: ");
		char x = 'x';
		f1(x);
		f2(x);
		f3(x);
		f4(x);
		f5(x);
		f6(x);
		f7(x);
		System.out.println();
	}
	
	private void byteTest() {
		System.out.println("byte: ");
		byte x = 3;
		f1(x);
		f2(x);
		f3(x);
		f4(x);
		f5(x);
		f6(x);
		f7(x);
		System.out.println();
	}
	
	private void shortTest() {
		System.out.println("short: ");
		short x = 3;
		f1(x);
		f2(x);
		f3(x);
		f4(x);
		f5(x);
		f6(x);
		f7(x);
		System.out.println();
	}
	
	private void intTest() {
		System.out.println("int: ");
		int x = 3;
		f1(x);
		f2(x);
		f3(x);
		f4(x);
		f5(x);
		f6(x);
		f7(x);
		System.out.println();
	}
	
	private void longTest() {
		System.out.println("long: ");
		long x = 3;
		f1(x);
		f2(x);
		f3(x);
		f4(x);
		f5(x);
		f6(x);
		f7(x);
		System.out.println();
	}
	
	private void floatTest() {
		System.out.println("float: ");
		float x = 3;
		f1(x);
		f2(x);
		f3(x);
		f4(x);
		f5(x);
		f6(x);
		f7(x);
		System.out.println();
	}
	
	private void doubleTest() {
		System.out.println("double: ");
		double x = 3;
		f1(x);
		f2(x);
		f3(x);
		f4(x);
		f5(x);
		f6(x);
		f7(x);
		System.out.println();
	}
	
	private void f1(char x) {
		System.out.print("f1(char)    ");
	}
	
	private void f1(byte x) {
		System.out.print("f1(byte)    ");
	}
	
	private void f1(short x) {
		System.out.print("f1(short)    ");
	}
	
	private void f1(int x) {
		System.out.print("f1(int)    ");
	}
	
	private void f1(long x) {
		System.out.print("f1(long)    ");
	}
	
	private void f1(float x) {
		System.out.print("f1(char)    ");
	}
	
	private void f1(double x) {
		System.out.print("f1(double)    ");
	}
	
	private void f2(byte x) {
		System.out.print("f2(byte)    ");
	}
	
	private void f2(short x) {
		System.out.print("f2(short)    ");
	}
	
	private void f2(int x) {
		System.out.print("f2(int)    ");
	}
	
	private void f2(long x) {
		System.out.print("f2(long)    ");
	}
	
	private void f2(float x) {
		System.out.print("f2(float)    ");
	}
	
	private void f2(double x) {
		System.out.print("f2(double)    ");
	}
	
	private void f3(short x) {
		System.out.print("f3(short)    ");
	}
	
	private void f3(int x) {
		System.out.print("f3(int)    ");
	}
	
	private void f3(long x) {
		System.out.print("f3(long)    ");
	}
	
	private void f3(float x) {
		System.out.print("f3(double)    ");
	}
	
	private void f3(double x) {
		System.out.print("f3(double)    ");
	}
	
	private void f4(int x) {
		System.out.print("f4(int)    ");
	}
	
	private void f4(long x) {
		System.out.print("f4(long)    ");
	}
	
	private void f4(float x) {
		System.out.print("f4(double)    ");
	}
	
	private void f4(double x) {
		System.out.print("f4(double)    ");
	}
	
	private void f5(long x) {
		System.out.print("f5(long)    ");
	}
	
	private void f5(float x) {
		System.out.print("f5(double)    ");
	}
	
	private void f5(double x) {
		System.out.print("f5(double)    ");
	}
	
	private void f6(float x) {
		System.out.print("f6(double)    ");
	}
	
	private void f6(double x) {
		System.out.print("f6(double)    ");
	}
	
	private void f7(double x) {
		System.out.print("f7(double)    ");
	}

}
