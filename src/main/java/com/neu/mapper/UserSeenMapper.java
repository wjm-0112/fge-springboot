package com.neu.mapper;

import com.neu.entity.CollectionMovieVo;
import com.neu.entity.SeenMovieVo;
import com.neu.entity.UserCollection;
import com.neu.entity.UserSeen;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserSeenMapper {
    public List<UserSeen> findUserSeen(Map<String,Object> map);

    List<UserSeen> getAllUserSeen();

    List<UserSeen> findUserSeenMo(Map<String,Object> map);
    List<UserSeen> findUserSeenMo1(Map<String,Object> map);

    // 添加
    public boolean addUserSeen(UserSeen userSeen);
    // 删除
    public boolean delUserSeen(int id);
    // 当前用户下所有已看电影列表
    List<UserSeen> getAllUserSeenByUname(String uname);

    List<SeenMovieVo> selectSeensByUser(@Param("uname") String uname);
}
