package com.xszx.beans;

public class Shopping {
    private int s_id;
    private String s_name; //商品名称
    private String s_property;//商品属性
    private int s_price;//商品价格
    private int s_amount;//商品数量

    public Shopping() {
    }

    public Shopping(int s_id, String s_name, String s_property, int s_price, int s_amount) {
        this.s_id = s_id;
        this.s_name = s_name;
        this.s_property = s_property;
        this.s_price = s_price;
        this.s_amount = s_amount;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_property() {
        return s_property;
    }

    public void setS_property(String s_property) {
        this.s_property = s_property;
    }

    public int getS_price() {
        return s_price;
    }

    public void setS_price(int s_price) {
        this.s_price = s_price;
    }

    public int getS_amount() {
        return s_amount;
    }

    public void setS_amount(int s_amount) {
        this.s_amount = s_amount;
    }

    @Override
    public String toString() {
        return "ShoppingDao{" +
                "s_id=" + s_id +
                ", s_name='" + s_name + '\'' +
                ", s_property='" + s_property + '\'' +
                ", s_price=" + s_price +
                ", s_amount=" + s_amount +
                '}';
    }
}
