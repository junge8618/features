package com.junge.demo.features.thinkinginjava.chapter07.initseq;

public class Export extends Base {
	private int k = printInit("Export.k initialized");
	
	public Export() {
		System.out.print("k = " + k);
		System.out.print(" j = " + j);
	}
	
	private static int x2 = printInit("static Export.x2 initialized");
	
	public static void main(String[] args) {
		System.out.println("Export2 constructor");
		new Export2();
		
		System.out.println("Export constructor");
		new Export();
	}
}
