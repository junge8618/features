package com.junge.demo.features.jdk8.base;

/**
 * 函数式接口就是只有一个方法的普通接口,注解@FunctionalInterface
 */
public class FunctionalInterfaceTest {

    public void print(FunctionInter1 f) {
        f.method(1);
    }

    public static void main(String[] args) {
        FunctionalInterfaceTest a = new FunctionalInterfaceTest();
        a.print( i -> 3);
    }

}

@FunctionalInterface
interface FunctionInter1 {
    int method(int i);
}
