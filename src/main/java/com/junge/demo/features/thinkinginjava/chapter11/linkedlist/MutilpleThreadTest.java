/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter11.linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author "liuxj"
 *
 */
public class MutilpleThreadTest {

	private static List<Integer> list = Collections.synchronizedList(new LinkedList<Integer>());

	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					for (int i = 0; i < 1000; i++) {
						System.out.println("thread of " + Thread.currentThread().getName() + " put " + i);
						list.add(i);
						
						try {
							TimeUnit.MILLISECONDS.sleep(1);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}

				}
			}).start();
		}
		try {
			TimeUnit.MILLISECONDS.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		synchronized (list) {
			Iterator<Integer> it = list.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
				try {
					TimeUnit.MILLISECONDS.sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
