/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter09.strategy;

/**
 * 描述类功能
 * @author "liuxj"
 * @date 2018年9月1日
 */
public class BirthdayCake extends CakeProcessor {

	/* (non-Javadoc)
	 * @see com.junge.demo.features.thinkinginjava.chapter09.strategy.Processor#process(java.lang.String)
	 */
	@Override
	public String process(String comp) {
		System.out.println("使用" + this.getName() + "制造蛋糕，原料有:" + comp);
		return "制造一个生日蛋糕";
	}

}
