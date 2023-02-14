package com.xszx.service.impl;

import com.xszx.beans.Ba;
import com.xszx.dao.BaDao;
import com.xszx.service.BaService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Learning makes me happy.
 * @date 2023/2/12 22:58
 */
@Service
public class BaServiceImpl implements BaService {
    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }


    @Override
    public List<Ba> getBaByType(String type) {
        BaDao baDao = sqlSessionTemplate.getMapper(BaDao.class);
        return baDao.getBaByType(type);
    }

    @Override
    public Ba getBaByBid(int bid) {
        BaDao baDao = sqlSessionTemplate.getMapper(BaDao.class);
        return baDao.getBaByBid(bid);
    }

    @Override
    public List<Ba> getBaOrderPrice(String type) {
        BaDao baDao = sqlSessionTemplate.getMapper(BaDao.class);
        return baDao.getBaOrderPrice(type);
    }

    @Override
    public List<Ba> getTicketByST(String type, String st) {
        BaDao baDao = sqlSessionTemplate.getMapper(BaDao.class);
        return baDao.getTicketByST(type,st);
    }

    @Override
    public List<Ba> getBaByUid(int u_id) {
        BaDao baDao = sqlSessionTemplate.getMapper(BaDao.class);
        return baDao.getBaByUid(u_id);
    }

    @Override
    public void addBa(Ba ba) {
        BaDao baDao = sqlSessionTemplate.getMapper(BaDao.class);
        baDao.addBa(ba);
    }
}
