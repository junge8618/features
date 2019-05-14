package com.junge.demo.features.jdk8.base;

import com.alibaba.fastjson.JSONArray;

import java.util.Arrays;

public class ArraysTest {

    public static void main(String[] args) {
        int[] arrays = new int[9];
        Arrays.setAll(arrays, operand -> operand + 2);

        System.out.println(JSONArray.toJSON(arrays));
    }
}
