package com.junge.demo.features.thinkinginjava.chapter10.override;

public class BigEgg extends Egg {
	private Yolk x;

	public class Yolk {
		public Yolk() {
			System.out.println("BigEgg.Yolk()");
		}
	}

	public BigEgg() {
		System.out.println("New BigEgg()");
		x = new Yolk();
	}

	public static void main(String[] args) {
		new BigEgg();
	}

}

class Egg {
	private Yolk y;

	protected class Yolk {
		public Yolk() {
			System.out.println("Egg.Yolk()");
		}
	}

	public Egg() {
		System.out.println("New Egg()");
		y = new Yolk();
	}

}