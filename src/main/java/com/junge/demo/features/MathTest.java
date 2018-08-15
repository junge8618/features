package com.junge.demo.features;

public class MathTest {

	public static void main(String[] args) {
		System.out.println(Math.round(33.5));
		System.out.println(Math.round(33.1));
		System.out.println(Math.round(33.6));
		
		for (int i=0; i<10000; i++) {
			System.out.println(Math.random());
		}
	}

}
