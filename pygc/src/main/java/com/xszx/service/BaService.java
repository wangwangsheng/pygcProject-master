package com.xszx.service;

import com.xszx.beans.Ba;

import java.util.List;

/**
 * @author Learning makes me happy.
 * @date 2023/2/12 22:56
 */
public interface BaService {

    //获得各个吧的信息
    List<Ba> getBaByType(String type);

    //获得一个吧的信息
    Ba getBaByBid(int bid);

    //根据价格排序
    List<Ba> getBaOrderPrice(String type);

    List<Ba> getTicketByST(String type, String st);

    List<Ba> getBaByUid(int u_id);

    void addBa(Ba ba);
}
