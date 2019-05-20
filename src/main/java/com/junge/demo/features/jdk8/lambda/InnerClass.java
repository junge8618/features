package com.junge.demo.features.jdk8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * 使用lambda表达式对匿名内部类处理
 * 1.事件监听处理
 * 2.线程
 * 3.排序等
 * (params) -> expression
 * (params) -> statement
 * (params) -> { statements }
 * @author liuxj
 * @date 2019-05-20 08:23
 */
public class InnerClass {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                System.out.println("使用匿名内部类方式。。。");
            }
        }).start();

        new Thread(() -> System.out.println("使用Lambda表达式")).start();

        Collections.sort(Arrays.asList(new Item(1, "商品1"), new Item(2, "商品2")), new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return o1.getGoodsid().compareTo(o2.getGoodsid());
            }
        });

        Collections.sort(Arrays.asList(new Item(1, "商品1"), new Item(2, "商品2")), (o1, o2) -> {
            return o1.getGoodsid().compareTo(o2.getGoodsid());
        });

        Collections.sort(Arrays.asList(new Item(1, "商品1"), new Item(2, "商品2")), (o1, o2) -> o1.getGoodsid().compareTo(o2.getGoodsid()));

        Collections.sort(Arrays.asList(new Item(1, "商品1"), new Item(2, "商品2")), Comparator.comparing(Item::getGoodsid));
    }
}

