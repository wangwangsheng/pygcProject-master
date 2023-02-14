package com.xszx.beans;

import java.util.Date;

/**
 * @author Learning makes me happy.
 * @date 2023/2/11 14:12
 */
public class News {
    //个人消息
    private int n_id;
    private int u_id;
    private String  n_name;
    private String  introduce;  //内容介绍
    private String  n_content;  //内容

    private Date create_time;
    private int create_id;
    private Date update_date;
    private int update_id;
    private int del_flag;
}
