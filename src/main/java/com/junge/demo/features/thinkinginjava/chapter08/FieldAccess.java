/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter08;

/**
 * @author "liuxj"
 *
 */
class Super {

	public int field = 0;
	
	public int getField() {
		return field;
	}
	
}

class Sun extends Super {
	public int field = 1;
	
	public int getField() {
		return field;
	}
	
	public int getSuperField() {
		return super.field;
	}
}

public class FieldAccess {
	public static void main(String[] args) {
		Super s = new Sun();
		System.out.println("s.field=" + s.field);
		System.out.println("s.getField()=" + s.getField());
		
		Sun sun = new Sun();
		System.out.println("sun.field=" + sun.field);
		System.out.println("sun.getField()=" + sun.getField());
		System.out.println("sun.getSuperField()=" + sun.getSuperField());
	}
}
