/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter11.linkedlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author "liuxj"
 *
 */
public class CollectionsShuffleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9 , 10);
		for (Integer i : list) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		Collections.shuffle(list);
		for (Integer i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		Collections.sort(list);
		for (Integer i : list) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		Collections.reverse(list);
		for (Integer i : list) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		Collections.swap(list, 0, list.size() - 1);
		for (Integer i : list) {
			System.out.print(i + " ");
		}

	}

}
