package com.xszx.beans;

import java.util.Date;

/**
 * @author Learning makes me happy.
 * @date 2023/2/11 14:18
 */
public class Comment {
    //评论表
    private int c_id;			//评论id
    private int u_id;
    private int b_id;
    private String c_content;	//评论内容
    private int c_score;		//分数

    private Date create_time;
    private int create_id;
    private Date update_date;
    private int update_id;
    private int del_flag;
}
