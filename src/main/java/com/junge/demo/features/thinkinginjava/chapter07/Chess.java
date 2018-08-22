/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter07;

/**
 * 基类没有默认构造器，导出类必须在构造器中显示调用基类构造器(使用super关键字)
 * @author "liuxj"
 *
 */
public class Chess extends BoardGame {

	public Chess() {
		super(11);
		System.out.println("Chess construction function");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Chess();

	}

}

class Game {
	public Game(int i) {
		System.out.println("Game construction function");
	}
}

class BoardGame extends Game {

	public BoardGame(int i) {
		super(i);
		System.out.println("BoardGame construction function");
	}
	
}
