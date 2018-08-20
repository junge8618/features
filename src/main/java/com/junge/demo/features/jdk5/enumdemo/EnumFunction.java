/**
 * 
 */
package com.junge.demo.features.jdk5.enumdemo;

/**
 * 枚举编译器添加的方法
 * 
 * @author "liuxj"
 *
 */
public class EnumFunction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (Color3 c : Color3.values()) {
			System.out.println(c.name());
		}
		
		System.out.println(Enum.valueOf(Color3.class, "RED"));
		System.out.println(Color3.valueOf("RED"));
		
		System.out.println(EnumFunction.class.isEnum());
		System.out.println(EnumFunction.class.getEnumConstants());
		
		System.out.println(Color3.class.isEnum());
		System.out.println(Color3.class.getEnumConstants());
		
		System.out.println(Color3.RED.getDeclaringClass());
		System.out.println(Color3.BLUE.getDeclaringClass() == Color3.RED.getDeclaringClass());

	}

}

enum Color3 {
	RED, BLUE;
}
