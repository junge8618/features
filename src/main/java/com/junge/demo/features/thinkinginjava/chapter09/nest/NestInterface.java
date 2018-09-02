/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter09.nest;

/**
 * 描述类功能
 * @author "liuxj"
 * @date 2018年9月2日
 */
public class NestInterface {
	
	public static void main(String[] args) {
		C c = new C();
		
		C.I1 i1 = c.new I1Impl();
		i1.func1();
		
		// C.I1 i2 = c.new I1Impl2(); // 私有的private内部内不可见
		c.getI3();
		c.refI3(c.new I3Impl());
		c.refI3(c.getI3());
	}

}

class C {
	public interface I1 {
		void func1();
	}
	
	public class I1Impl implements I1 {
		@Override
		public void func1() {
			
		}
	}
	
	private class I1Impl2 implements I1 {
		@Override
		public void func1() {
			
		}
	}
	
	interface I2 {
		void func2();
	}
	
	public class I2Impl implements I2 {
		@Override
		public void func2() {
			
		}
	}
	
	private class I2Impl2 implements I2 {
		@Override
		public void func2() {
			
		}
	}
	
	private interface I3 {
		void func3();
	}
	
	public class I3Impl implements I3 {
		@Override
		public void func3() {
			
		}
	}
	
	private class I3Impl2 implements I3 {
		@Override
		public void func3() {
			
		}
	}
	
	private I3 i3;
	
	public I3 getI3() {
		return new I3Impl2();
	}
	
	public void refI3(I3 i3) {
		this.i3 = i3;
		this.i3.func3();
	}
}