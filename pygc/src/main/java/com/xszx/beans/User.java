package com.xszx.beans;

import java.util.Date;

/**
 * @author Learning makes me happy.
 * @date 2023/2/9 10:35
 */
public class User {

   
   private int u_id;
   private String username;
   private String phone;
   private String address;
   private String password;

   private Date create_time;
   private int create_id;
   private Date update_date;
   private int update_id;
   private int del_flag;

   public User() {
   }

   public User(int u_id, String username, String phone, String address, String password, Date create_time, int create_id, Date update_date, int update_id, int del_flag) {
      this.u_id = u_id;
      this.username = username;
      this.phone = phone;
      this.address = address;
      this.password = password;
      this.create_time = create_time;
      this.create_id = create_id;
      this.update_date = update_date;
      this.update_id = update_id;
      this.del_flag = del_flag;
   }

   public int getU_id() {
      return u_id;
   }

   public void setU_id(int u_id) {
      this.u_id = u_id;
   }

   public String getUsername() {
      return username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public Date getCreate_time() {
      return create_time;
   }

   public void setCreate_time(Date create_time) {
      this.create_time = create_time;
   }

   public int getCreate_id() {
      return create_id;
   }

   public void setCreate_id(int create_id) {
      this.create_id = create_id;
   }

   public Date getUpdate_date() {
      return update_date;
   }

   public void setUpdate_date(Date update_date) {
      this.update_date = update_date;
   }

   public int getUpdate_id() {
      return update_id;
   }

   public void setUpdate_id(int update_id) {
      this.update_id = update_id;
   }

   public int getDel_flag() {
      return del_flag;
   }

   public void setDel_flag(int del_flag) {
      this.del_flag = del_flag;
   }

   @Override
   public String toString() {
      return "User{" +
              "u_id=" + u_id +
              ", username='" + username + '\'' +
              ", phone='" + phone + '\'' +
              ", address='" + address + '\'' +
              ", password='" + password + '\'' +
              ", create_time=" + create_time +
              ", create_id=" + create_id +
              ", update_date=" + update_date +
              ", update_id=" + update_id +
              ", del_flag=" + del_flag +
              '}';
   }
}
