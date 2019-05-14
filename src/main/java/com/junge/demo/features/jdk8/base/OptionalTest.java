package com.junge.demo.features.jdk8.base;

import java.util.Optional;

/**
 * Java 8引入Optional类来防止空指针异常，Optional类最先是由Google的Guava项目引入的。Optional类实际上是个容器：它可以保存类型T的值，或者保存null。使用Optional类我们就不用显式进行空指针检查了。
 */
public class OptionalTest {
    public static void main(String[] args) {
        ClassC cc = null;
        Optional<ClassC> c = Optional.ofNullable(cc);
        System.out.println(c.isPresent());
        c.get();
    }


}

class ClassC {
    public void print() {
        System.out.println("ClassC print...");
    }
}