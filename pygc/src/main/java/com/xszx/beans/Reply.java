package com.xszx.beans;

import java.util.Date;

/**
 * @author Learning makes me happy.
 * @date 2023/2/11 14:20
 */
public class Reply {
    //回复评论表
    private int r_id;			//回复id
    private int u_id;		    //用户id
    private int c_id;			//回复评论
    private String r_content;	//回复内容

    private Date create_time;
    private int create_id;
    private Date update_date;
    private int update_id;
    private int del_flag;
}
