package com.neu.biz;

import com.neu.entity.Rank;

import java.util.List;

public interface RankBiz {
    public List<Rank> findRank(int index, int size);
    public List<Rank> findRankMo(int index, int size, String name);
    public boolean delRank(int rid);
    public boolean addRank(Rank rank);
    public Rank findById(int rid);
    public boolean updateRank(Rank rank);
}
