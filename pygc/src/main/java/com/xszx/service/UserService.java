package com.xszx.service;

import com.xszx.beans.User;

/**
 * @author Learning makes me happy.
 * @date 2023/2/9 10:36
 */
public interface UserService {
    User login(String phone, String password);

    User checkPhone(String phone);

    void addUser(String phone, String password);

    void updatePassword(String phone, String newPassword);
}
