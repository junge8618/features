/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter10.anon;

/**
 * 引用外部参数
 * 描述类功能
 * @author "liuxj"
 * @date 2018年9月9日
 */
public class RefOutterParam {

	public Behavior getSomething(final String name) {
		return new Behavior() {
			private String innername = name;
			
			@Override
			public void doSomething(String newName) {
				System.out.println("do something... " + this.innername);
				this.innername = newName;
				System.out.println("do something... " + this.innername);
				
			}
		};
	}
	
	public static void main(String[] args) {
		RefOutterParam p = new RefOutterParam();
		p.getSomething("task1").doSomething("task2");
	}
}

interface Behavior {
	void doSomething(String name);
}
