package com.oj.dao;

import java.sql.SQLException;

import com.oj.entity.User;

/** 
* 类说明:关于用户的数据交互
*/
public interface UserDao {
	
	//用户查询
	public User getUser(User user) throws SQLException ;
	//插入新用户
	public boolean insertUser(User user) throws SQLException ;
	//修改用户信息
	public void editUserInfo(int id, String nickname, String username, String phone, String student_id) ;
	//修改用户密码
	public void editUserPwd(int id, String password) ; 
}
