package com.junge.demo.features.jdk8.lambda;

/**
 * @author liuxj
 * @date 2019-05-20 08:47
 */
public class Item {

    private Integer goodsid;
    private String name;

    public Item(Integer goodsid, String name) {
        this.goodsid = goodsid;
        this.name = name;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "goodsid=" + goodsid +
                ", name='" + name + '\'' +
                '}';
    }
}
