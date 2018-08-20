/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter05;

/**
 * 静态成员初始化
 * @author "liuxj"
 *
 */
public class StaticMemInit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.println(Report.goods3);
		new Report();
		//new Order();

	}

}

class Goods {
	int goodsid;
	public Goods(int goodsid) {
		this.goodsid = goodsid;
		System.out.println("创建商品，商品ID:" + goodsid);
	}
}

class Order {
	public static Goods goods = new Goods(1);
}

class Report {
	public static Goods goods = new Goods(2);
	public static Order order = new Order();
	public static Goods goods3 = new Goods(3);
	public Goods goods4 = new Goods(4);
}
