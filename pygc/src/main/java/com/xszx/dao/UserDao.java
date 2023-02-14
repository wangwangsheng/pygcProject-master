package com.xszx.dao;

import com.xszx.beans.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Learning makes me happy.
 * @date 2023/2/9 10:37
 */
public interface UserDao {
    User login(@Param("phone") String phone, @Param("password")String password);

    User checkPhone(String phone);

    void addUser(@Param("phone")String phone, @Param("password")String password);

    void updatePassword(@Param("phone")String phone, @Param("newPassword")String newPassword);
}
