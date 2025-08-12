package com.neu.biz;

import com.neu.entity.User;
import com.neu.entity.UserCollection;
import com.neu.entity.UserSeen;

import java.util.List;

public interface UserBiz {
    public User login(String uname, String upwd,  int role);
    public boolean regUser(User user);
    public List<User> findUser(int index, int size);
    public List<User> findUserMo(int index, int size,String uname);
    public boolean delUser(int id);
    public User findById(int id);
    public boolean updateUser(User user);
    public boolean addUser(User user);

    // 数据统计分析--获取全部用户
    List<User> getAllUser();
    List<UserCollection> getAllUserCollection();
    List<UserSeen> getAllUserSeen();

    // 修改用户名、密码、邮箱
    boolean updateInformation(User user);
}
