/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter10.anon;

/**
 * 描述类功能
 * 
 * @author "liuxj"
 * @date 2018年9月9日
 */
public abstract class Base {
	private String name;

	public Base(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void printName();
}
