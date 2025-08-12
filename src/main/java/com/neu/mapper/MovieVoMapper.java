package com.neu.mapper;

import com.neu.entity.MovieVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MovieVoMapper {
    // 获取所有电影信息
    public List<MovieVo> getAllMovieVo();
}
