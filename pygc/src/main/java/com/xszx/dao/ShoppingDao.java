package com.xszx.dao;

import com.xszx.beans.Shopping;

import java.util.List;

public interface ShoppingDao {
    List<Shopping> getshopping();

    void updatesid2(int s_id);

    Shopping getshoppingamount(int s_id);

    void updatesid1(int s_id);

    void addShopping(int u_id,int b_id);
}
