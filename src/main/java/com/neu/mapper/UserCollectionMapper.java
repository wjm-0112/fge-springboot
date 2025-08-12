package com.neu.mapper;

import com.neu.entity.CollectionMovieVo;
import com.neu.entity.CommentMovieVO;
import com.neu.entity.UserCollection;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserCollectionMapper {
    public List<UserCollection> findUserCollection(Map<String,Object> map);
    public List<UserCollection> findUserCollectionMo(Map<String,Object> map);
    public List<UserCollection> findUserCollectionMo1(Map<String,Object> map);
    public boolean delUserCollection(int id);
    public UserCollection findById(int id);
    public boolean updateUserCollection(UserCollection userCollection);
    public boolean addUserCollection(UserCollection userCollection);

    // 数据统计分析--获取所有用户的收藏
    List<UserCollection> getAllUserCollection();

    // 获得当前用户下所有的电影收藏
    List<UserCollection> getAllUserCollectionByUname(Map<String,Object> map);

    List<CollectionMovieVo> selectCollectionsByUser(@Param("uname") String uname);

}
