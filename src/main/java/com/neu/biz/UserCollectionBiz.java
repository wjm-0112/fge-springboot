package com.neu.biz;

import com.neu.entity.CollectionMovieVo;
import com.neu.entity.CommentMovieVO;
import com.neu.entity.UserCollection;

import java.sql.Date;
import java.util.List;

public interface UserCollectionBiz {
    public List<UserCollection> findUserCollection(int index, int size);
    public List<UserCollection> findUserCollectionMo(int index, int size, int mid);
    public List<UserCollection> findUserCollectionMo1(int index, int size, String mname);
    public boolean delUserCollection(int mid);
    public UserCollection findById(int id);
    public boolean updateUserCollection(UserCollection userCollection);
    public boolean addUserCollection(UserCollection userCollection);
    public List<UserCollection> getAllUserCollectionByUname(String uname);

    List<CollectionMovieVo> getUserCollections(String uname);
}
