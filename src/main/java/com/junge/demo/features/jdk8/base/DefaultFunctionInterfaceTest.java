package com.junge.demo.features.jdk8.base;

/**
 * 1.可以在接口中定义默认方法，使用default关键字，并提供默认的实现。所有实现这个接口的类都会接受默认方法的实现，除非子类提供的自己的实现。
 * 2.可以在接口中定义静态方法，使用static关键字，也可以提供实现
 * 接口的默认方法和静态方法的引入，其实可以认为引入了C＋＋中抽象类的理念，以后我们再也不用在每个实现类中都写重复的代码了
 *
 */
public class DefaultFunctionInterfaceTest {
    public static void main(String[] args) {

        ClassA a = new ClassA();
        ClassB b = new ClassB();
        System.out.println(a.defaultFunction());
        System.out.println(b.defaultFunction());
        System.out.println(DefaultFunctionInterface.staticFunction());


    }
}

interface DefaultFunctionInterface {
    default String defaultFunction() {
        return "default function";
    }


    static String staticFunction() {
        return "static function";
    }

}

class ClassA implements DefaultFunctionInterface {
    @Override
    public String defaultFunction() {
        return "Class A impl";
    }
}

class ClassB implements DefaultFunctionInterface {

}
