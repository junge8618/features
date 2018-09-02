/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter09.nest;

/**
 * 描述类功能
 * @author "liuxj"
 * @date 2018年9月2日
 */
public class Interface1Impl implements Interface1 {

	/* (non-Javadoc)
	 * @see com.junge.demo.features.thinkinginjava.chapter09.nest.Interface1#fun()
	 */
	@Override
	public void fun() {
		// TODO Auto-generated method stub

	}

	/**
	 * 描述方法功能和使用场景
	 * @author "liuxj"
	 * @date 2018年9月2日
	 * @param args
	 */
	public static void main(String[] args) {
		Interface1 i1 = new Interface1Impl();
		i1.fun();

		Interface1.I2 i2 = new Interface1Imp2();
		i2.fun2();
	}

}

class Interface1Imp2 implements Interface1.I2 {

	@Override
	public void fun2() {
		
	}
	
}
