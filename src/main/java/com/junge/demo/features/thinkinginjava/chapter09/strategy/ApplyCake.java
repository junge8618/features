/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter09.strategy;

import java.util.Arrays;
import java.util.List;

/**
 * 描述类功能
 * @author "liuxj"
 * @date 2018年9月1日
 */
public class ApplyCake {
	
	public static void process(List<CakeProcessor> applyCakes) {
		for (Processor cake : applyCakes) {
			cake.process("奶酪 面包");
		}
	}

	/**
	 * 描述方法功能和使用场景
	 * @author "liuxj"
	 * @date 2018年9月1日
	 * @param args
	 */
	public static void main(String[] args) {
		ApplyCake.process(Arrays.asList(new BirthdayCake(), new MeetCake()));

	}

}
