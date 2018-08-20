/**
 * 
 */
package com.junge.demo.features.jdk5.enumdemo;

/**
 * @author "liuxj"
 *
 */
public class MealTest {
	public static void main(String[] args) {
		Food[] foods = Meal.COFFEE.getAllFood();
		for (Food f : foods) {
			System.out.println(f);
		}
	}
}

enum Meal {
	APPETIZER(Food.Appetizer.class), 
	MAINCOURSE(Food.MainCourse.class), 
	DESSERT(Food.Dessert.class), 
	COFFEE(Food.Coffee.class);

	private Food[] values;

	private Meal(Class<? extends Food> kind) {
		// 通过class对象获取枚举实例
		values = kind.getEnumConstants();
	}
	
	public Food[] getAllFood() {
		return this.values;
	}

}
