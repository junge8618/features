/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter09;

/**
 * 接口嵌套
 * 
 * @author "liuxj"
 * @date 2018年9月2日
 */
public class NestingInterfaces {
	public class BImp implements A.B {
		public void fun() {
		}
	}

	class CImp implements A.C {
		public void fun() {
		};
	}
	
	/*class DImpl implements A.D {

		@Override
		public void fun() {
			
		}
		
	}*/

	class EImp implements E {
		public void g() {
		};
	}

	class EGImp implements E.G {
		public void fun() {

		};
	}

	class EImp2 implements E {
		public void g() {
		}

		class EG implements E.G {
			public void fun() {
			}
		}
	}

	public static void main(String[] args) {
		A a = new A();
		/* A.D d = a.getD(); //D为私有类，外面的类没有权限访问 */
		//A.DImp2 d2 = a.getD();
		//a.getD().fun();
		a.receiveD(a.getD());
	}
}

/**
 * 该类是用于说明嵌套接口
 */
class A {
	interface B {
		void fun();
	}

	public class BImp implements B {
		public void fun() {
		}
	}

	private class BImp2 implements B {
		public void fun() {
		}
	}

	public interface C {
		void fun();
	}

	class CImp implements C {
		public void fun() {
		}
	}

	private class CImp2 implements C {
		public void fun() {
		}
	}

	private interface D {
		void fun();
	}

	private class DImp implements D {
		public void fun() {
		};
	}

	public class DImp2 implements D {
		public void fun() {
		}
	}

	public D getD() {
		return new DImp2();
	}

	private D dRef;

	public void receiveD(D d) {
		dRef = d;
		dRef.fun();
	}
}

interface E {
	interface G {
		void fun();
	}

	public interface H {
		void f();
	}

	void g();
}
