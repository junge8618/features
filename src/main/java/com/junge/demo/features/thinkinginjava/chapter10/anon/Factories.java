/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter10.anon;

/**
 * 匿名内部类在工厂模式中的应用
 * 
 * @author "liuxj"
 * @date 2018年9月9日
 */
public class Factories {

	public static void consumeService(ServiceFactory factory) {
		Service service = factory.getService();
		service.method1();
		service.method2();
	}
	
	public static void main(String[] args) {
		consumeService(ServiceImplements1.factory);
		consumeService(ServiceImplements2.factory);
	}
}

interface Service {
	void method1();

	void method2();
}

interface ServiceFactory {
	Service getService();
}

class ServiceImplements1 implements Service {

	private ServiceImplements1() {

	}

	@Override
	public void method1() {
		System.out.println("ServiceImplements1 method1");

	}

	@Override
	public void method2() {
		System.out.println("ServiceImplements1 method2");

	}

	public static ServiceFactory factory = new ServiceFactory() {
		public Service getService() {
			return new ServiceImplements1();
		}
	};

}

class ServiceImplements2 implements Service {

	private ServiceImplements2() {

	}

	@Override
	public void method1() {
		System.out.println("ServiceImplements2 method1");

	}

	@Override
	public void method2() {
		System.out.println("ServiceImplements2 method2");

	}

	public static ServiceFactory factory = new ServiceFactory() {

		@Override
		public Service getService() {
			return new ServiceImplements2();
		}
	};

}
