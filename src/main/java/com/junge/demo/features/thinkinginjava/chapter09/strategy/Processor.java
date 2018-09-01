/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter09.strategy;

/**
 * 处理器
 * @author "liuxj"
 * @date 2018年9月1日
 */
public interface Processor {
	
	String getName();

	String process(String comp);
}
