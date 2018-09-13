/**
 * 
 */
package com.junge.demo.features.thinkinginjava.chapter10;

/**
 * 描述类功能
 * @author "liuxj"
 * @date 2018年9月8日
 */
public class InnerClassModifyOuter {
	
	private String field1 = "field1";
	
	private void modifyField1(String field1) {
		this.field1 = field1;
	}
	
	@Override
	public String toString() {
		return "InnerClassModifyOuter [field1=" + field1 + "]";
	}
	
	public void invokeInnerFunction() {
		System.out.println("before:" + this);
		
		Inner i = new Inner();
		i.modifyOuterField();
		System.out.println("modifyOuterField:" + this);
		
		i.modifyOuterField2();
		System.out.println("modifyOuterField2:" + this);
		
		System.out.println(i.ifield);
		
		System.out.println(i.getIfeild());
	}

	class Inner {
		void modifyOuterField() {
			field1 = "inner field1 value";
		}
		
		void modifyOuterField2() {
			modifyField1("invoke outer method");
		}
		
		private String ifield = "ddddd";
		
		private String getIfeild() {
			return this.ifield;
		}
	}
	
	

	/**
	 * 描述方法功能和使用场景
	 * @author "liuxj"
	 * @date 2018年9月8日
	 * @param args
	 */
	public static void main(String[] args) {
		InnerClassModifyOuter i = new InnerClassModifyOuter();
		i.invokeInnerFunction();

	}

}
