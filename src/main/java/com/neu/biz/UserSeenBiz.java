package com.neu.biz;

import com.neu.entity.SeenMovieVo;
import com.neu.entity.UserSeen;

import java.util.List;

public interface UserSeenBiz {
    public List<UserSeen> findUserSeen(int index, int size);
        List<UserSeen> getAllUserSeenByUname (String uname);

        List<UserSeen> findUserSeenMo(int index, int size, int mid);
        List<UserSeen> findUserSeenMo1(int index, int size, String mname);
        public boolean delUserSeen(int id);
        public boolean addUserSeen(UserSeen userSeen);

        List<SeenMovieVo> getUserSeens(String uname);
}
