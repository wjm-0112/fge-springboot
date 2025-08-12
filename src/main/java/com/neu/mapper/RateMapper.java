package com.neu.mapper;

import com.neu.entity.Rating;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface RateMapper {
    public List<Rating> findRate(Map<String,Object> map);
}
