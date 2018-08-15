package com.junge.demo.features;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		BaseTypeInitValue t = new BaseTypeInitValue();
		System.out.println(t.c);
		System.out.println(t.b);
		System.out.println(t.s);
		System.out.println(t.by);
		System.out.println(t.i);
		System.out.println(t.l);
		System.out.println(t.f);
		System.out.println(t.d);
	}
}

class BaseTypeInitValue {
	char c;
	boolean b;
	short s;
	byte by;
	int i;
	long l;
	float f;
	double d;
}

class BaseTypeInitValue2 {
	Character c;
	Boolean b;
	Short s;
	Byte by;
	Integer i;
	Long l;
	Float f;
	Double d;
}
