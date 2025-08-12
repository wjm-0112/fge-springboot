package com.neu.mapper;

import com.neu.entity.User;
import com.neu.entity.UserCollection;
import com.neu.entity.UserSeen;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {
    // 登录
    public User login(@Param("uanme") String uname, @Param("upwd") String upwd,  @Param("role") int role);
    // 注册
    public boolean regUser(User user);
    // 查询用户列表
    public List<User> findUser(Map<String,Object> map);
    // 模糊查询
    public List<User> findUserMo(Map<String,Object> map);
    // 删除用户数据
    public boolean delUser(int id);
    // 根据 id 查询数据
    public User findById(int id);
    // 修改用户数据
    public boolean updateUser(User user);
    // 添加数据
    public boolean addUser(User user);

    // 数据统计--获取所有用户
    List<User> getAllUser();
    List<UserCollection> getAllUserCollection();
    List<UserSeen> getAllUserSeen();

    // 修改用户名、密码和邮箱
    public boolean updateInformation(User user);
}
