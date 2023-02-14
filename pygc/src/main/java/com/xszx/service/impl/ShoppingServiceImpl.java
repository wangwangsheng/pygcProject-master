package com.xszx.service.impl;

import com.xszx.beans.Shopping;
import com.xszx.dao.ShoppingDao;
import com.xszx.service.ShoppingService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShoppingServiceImpl implements ShoppingService {
    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }


    @Override
    public List<Shopping> getshopping() {
        ShoppingDao shoppingDao = sqlSessionTemplate.getMapper(ShoppingDao.class);
        return shoppingDao.getshopping();
    }

    @Override
    public void updatesid2(int s_id) {
        ShoppingDao shoppingDao = sqlSessionTemplate.getMapper(ShoppingDao.class);
        shoppingDao.updatesid2(s_id);
    }

    @Override
    public Shopping getshoppingamount(int s_id) {
        ShoppingDao shoppingDao = sqlSessionTemplate.getMapper(ShoppingDao.class);

        return shoppingDao.getshoppingamount(s_id);
    }

    @Override
    public void updateSid1(int s_id) {
        ShoppingDao shoppingDao = sqlSessionTemplate.getMapper(ShoppingDao.class);
        shoppingDao.updatesid1(s_id);
    }

    @Override
    public void addShopping(int u_id,int b_id) {
        ShoppingDao shoppingDao = sqlSessionTemplate.getMapper(ShoppingDao.class);
        shoppingDao.addShopping(u_id,b_id);
    }


}
