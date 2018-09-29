/**
 * 
 */
package com.junge.demo.features.jdk5.introspector;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author "liuxj"
 *
 */
public class IntrospectorTest {

	/**
	 * @param args
	 * @throws IntrospectionException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 */
	public static void main(String[] args) throws Exception {
		Student s = new Student("张三", 28);
		System.out.println(getPropertyValueByName(s, "name"));
		
		writeProperty(s, "name", "李四");
		System.out.println(getPropertyValueByName(s, "name"));
		
		printAllProperties(s);

	}
	
	public static Object getPropertyValueByName(Student s, String propertyName) throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		PropertyDescriptor p = new PropertyDescriptor(propertyName, s.getClass());
		Method readMethod = p.getReadMethod();
		return readMethod.invoke(s);
	}
	
	public static void writeProperty(Student s, String propertyName, Object propertyValue) throws Exception {
		PropertyDescriptor p = new PropertyDescriptor(propertyName, s.getClass());
		Method writeMethod = p.getWriteMethod();
		writeMethod.invoke(s, propertyValue);
	}
	
	public static void printAllProperties(Student s) throws Exception {
		BeanInfo beanInfo = Introspector.getBeanInfo(s.getClass());
		PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
		for (PropertyDescriptor p : propertyDescriptors) {
			Method readMethod = p.getReadMethod();
			System.out.println(p.getName() + "=" + readMethod.invoke(s));
		}
	}

}
