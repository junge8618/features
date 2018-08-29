/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter08;

/**
 * 协变返回类型
 * 导出类（子类）覆盖（即重写）基类（父类）方法时，返回的类型可以是基类方法返回类型的子类。
 * @author "liuxj"
 *
 */
public class CovariantReturn {
	public static void main(String[] args) {
		Mill m = new Mill();
		Grain g = new Grain();
		System.out.println(g);
		m = new WheatMill();
		g = m.process();
		System.out.println(g);
	}
}

class Grain {
	public String toString() {
		return "Grain";
	}
}

class Wheat extends Grain {
	public String toString() {
		return "Wheat";
	}
}

class Mill {
	Grain process() {
		return new Grain();
	}
}

class WheatMill extends Mill {
	Wheat process() {
		return new Wheat();
	}
}