/**
 * 
 */
package com.junge.demo.features.enumdemo;

import com.junge.demo.features.enumdemo.Food.Appetizer;
import com.junge.demo.features.enumdemo.Food.Coffee;
import com.junge.demo.features.enumdemo.Food.Dessert;
import com.junge.demo.features.enumdemo.Food.MainCourse;

/**
 * @author "liuxj"
 *
 */
public class TypeOfFood {
	public static void main(String[] args) {
		Food food = Appetizer.SALAD;
		System.out.println(food);
		
		food = MainCourse.LASAGNE;
		System.out.println(food);
		
		food = Dessert.GELATO;
		System.out.println(food);
		
		food = Coffee.CAPPUCCINO;
		System.out.println(food);
	}
}
