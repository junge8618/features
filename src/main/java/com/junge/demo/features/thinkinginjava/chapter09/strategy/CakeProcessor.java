/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter09.strategy;

/**
 * 描述类功能
 * @author "liuxj"
 * @date 2018年9月1日
 */
public abstract class CakeProcessor implements Processor {

	@Override
	public String getName() {
		return this.getClass().getSimpleName();
	}

}
