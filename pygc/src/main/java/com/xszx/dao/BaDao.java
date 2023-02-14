package com.xszx.dao;

import com.xszx.beans.Ba;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Learning makes me happy.
 * @date 2023/2/12 22:59
 */

public interface BaDao {
    List<Ba> getBaByType(String type);

    Ba getBaByBid(int bid);

    List<Ba> getBaOrderPrice(String type);

    List<Ba> getTicketByST(@Param("b_type") String type, @Param("b_st") String st);

    List<Ba> getBaByUid(int u_id);

    void addBa(Ba ba);
}
