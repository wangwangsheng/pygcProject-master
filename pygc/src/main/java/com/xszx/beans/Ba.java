package com.xszx.beans;

import java.util.Date;

/**
 * @author Learning makes me happy.
 * @date 2023/2/11 14:15
 */
public class Ba {
    //吧
    private int b_id;
    private int u_id;
    private int p_id;
    private String b_name;			//物品名称
    private String b_introduce;		//物品绍
    private int b_sales;	        //物品销量
    private Double b_price;			//物品价格
    private String b_content;		//图文详情
    private String b_type;			//大类型
    private String b_st;     		//小类型
    private String b_image;
    private Dict dict;

    private Date create_time;
    private int create_id;
    private Date update_date;
    private int update_id;
    private int del_flag;



    public Ba() {
    }

    public Ba(int b_id, int u_id, int p_id, String b_name, String b_introduce, int b_sales, Double b_price, String b_content, String b_type, String b_st, String b_image, Dict dict, Date create_time, int create_id, Date update_date, int update_id, int del_flag) {
        this.b_id = b_id;
        this.u_id = u_id;
        this.p_id = p_id;
        this.b_name = b_name;
        this.b_introduce = b_introduce;
        this.b_sales = b_sales;
        this.b_price = b_price;
        this.b_content = b_content;
        this.b_type = b_type;
        this.b_st = b_st;
        this.b_image = b_image;
        this.dict = dict;
        this.create_time = create_time;
        this.create_id = create_id;
        this.update_date = update_date;
        this.update_id = update_id;
        this.del_flag = del_flag;
    }

    public Ba(int u_id, String b_name, Double b_price, String b_type, String b_image) {
        this.u_id = u_id;
        this.b_name = b_name;
        this.b_price = b_price;
        this.b_type = b_type;
        this.b_image = b_image;
    }

    public String getB_image() {
        return b_image;
    }

    public void setB_image(String b_image) {
        this.b_image = b_image;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public int getB_id() {
        return b_id;
    }

    public void setB_id(int b_id) {
        this.b_id = b_id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public String getB_introduce() {
        return b_introduce;
    }

    public void setB_introduce(String b_introduce) {
        this.b_introduce = b_introduce;
    }

    public int getB_sales() {
        return b_sales;
    }

    public void setB_sales(int b_sales) {
        this.b_sales = b_sales;
    }

    public Double getB_price() {
        return b_price;
    }

    public void setB_price(Double b_price) {
        this.b_price = b_price;
    }

    public String getB_content() {
        return b_content;
    }

    public void setB_content(String b_content) {
        this.b_content = b_content;
    }

    public String getB_type() {
        return b_type;
    }

    public void setB_type(String b_type) {
        this.b_type = b_type;
    }

    public String getB_st() {
        return b_st;
    }

    public void setB_st(String b_st) {
        this.b_st = b_st;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public int getCreate_id() {
        return create_id;
    }

    public void setCreate_id(int create_id) {
        this.create_id = create_id;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }

    public int getUpdate_id() {
        return update_id;
    }

    public void setUpdate_id(int update_id) {
        this.update_id = update_id;
    }

    public int getDel_flag() {
        return del_flag;
    }

    public void setDel_flag(int del_flag) {
        this.del_flag = del_flag;
    }

    public Dict getDict() {
        return dict;
    }

    public void setDict(Dict dict) {
        this.dict = dict;
    }

    @Override
    public String toString() {
        return "Ba{" +
                "b_id=" + b_id +
                ", u_id=" + u_id +
                ", p_id=" + p_id +
                ", b_name='" + b_name + '\'' +
                ", b_introduce='" + b_introduce + '\'' +
                ", b_sales=" + b_sales +
                ", b_price=" + b_price +
                ", b_content='" + b_content + '\'' +
                ", b_type='" + b_type + '\'' +
                ", b_st='" + b_st + '\'' +
                ", b_image='" + b_image + '\'' +
                ", dict=" + dict +
                ", create_time=" + create_time +
                ", create_id=" + create_id +
                ", update_date=" + update_date +
                ", update_id=" + update_id +
                ", del_flag=" + del_flag +
                '}';
    }
}
