/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 描述类功能
 * @author "liuxj"
 * @date 2018年9月15日
 */
public class CollectionsTest {

	/**
	 * 描述方法功能和使用场景
	 * @author "liuxj"
	 * @date 2018年9月15日
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		list.set(0, -1);
		//list.add(5);
		//list.remove(3);
		
		Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Integer[] mores = {6, 7, 8, 9, 10};
		collection.addAll(Arrays.asList(mores));
		Collections.addAll(collection, 1, 2, 3, 4, 5);
		Collections.addAll(collection, mores);
		
		List<Snow> snow1 = Arrays.asList(new Power(), new Crusty(), new Slush());
		//List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
		List<Snow> snow3 = new ArrayList<Snow>();
		Collections.addAll(snow3, new Light(), new Heavy());
		
		List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy());

	}

}

class Snow {}
class Power extends Snow {}
class Light extends Power {}
class Heavy extends Power {}
class Crusty extends Snow {}
class Slush extends Snow {}
