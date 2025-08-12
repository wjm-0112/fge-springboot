package com.neu.mapper;

import com.neu.entity.Rank;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface RankMapper {
    public List<Rank> findRank(Map<String,Object> map);
    public List<Rank> findRankMo(Map<String,Object> map);
    public boolean delRank(int rid);
    public boolean addRank(Rank rank);
    public Rank findById(int rid);
    public boolean updateRank(Rank rank);
}
