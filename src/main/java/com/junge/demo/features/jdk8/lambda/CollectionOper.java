package com.junge.demo.features.jdk8.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * 集合操作
 * @author liuxj
 * @date 2019-05-20 08:54
 */
public class CollectionOper {

    public static void main(String[] args) {
        List<Item> itemList = Arrays.asList(new Item(1, "商品1"), new Item(2, "商品2"));

        // java8以前的操作
        for (Item item : itemList) {
            System.out.println(item.getName());
        }

        // java8操作
        itemList.forEach(n -> System.out.println(n.getName()));

        // 使用Java 8的方法引用更方便，方法引用由::双冒号操作符标示
        itemList.forEach(System.out::println);
    }
}
