/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter10.upcast.imp2;

import com.junge.demo.features.thinkinginjava.chapter10.upcast.Destination;
import com.junge.demo.features.thinkinginjava.chapter10.upcast.impl.PDestination;

/**
 * 描述类功能
 * @author "liuxj"
 * @date 2018年9月8日
 */
public class MDestination extends PDestination {
	
	public Destination getDest() {
		return new InnerDestination("dsss");
	}

	public static void main(String[] args) {
		MDestination m = new MDestination();
		System.out.println(m.getDest());
	}
}
