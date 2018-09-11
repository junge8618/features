/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter10;

/**
 * 局部内部类与匿名内部类
 * @author "liuxj"
 *
 */
public class LocalInnerClass {
	
	private int count = 0;
	
	public Counter getCounter(final String name) {
		class LocalCounter implements Counter {
			
			public LocalCounter() {
				System.out.println(name + "counter");
			}

			@Override
			public int next() {
				System.out.print(name);
				return ++count;
			}
			
		}
		
		return new LocalCounter();
	}
	
	public Counter getCounter2(final String name) {
		return new Counter(){

			{
				System.out.println(name + "counter");
			}
			@Override
			public int next() {
				System.out.print(name);
				return ++count;
			}
			
		};
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalInnerClass inner = new LocalInnerClass();
		Counter counter1 = inner.getCounter("Local Inner ");
		Counter counter2 = inner.getCounter2("Anonymous Inner ");
		
		for (int i=0; i<5; i++) {
			System.out.println(counter1.next());
		}
		
		for (int i=0; i<5; i++) {
			System.out.println(counter2.next());
		}

	}

}

interface Counter {
	int next();
}
