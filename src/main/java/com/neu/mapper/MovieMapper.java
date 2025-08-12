package com.neu.mapper;

import com.neu.entity.Movie;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MovieMapper {
    public List<Movie> findMovie(Map<String,Object> map);
    List<Movie> findAll();
    public List<Movie> findMovieMo(Map<String,Object> map);
    public boolean delMovie(int mid);
    public Movie findById(int mid);
    public boolean updateMovie(Movie movie);
    public boolean addMovie(Movie movie);
    // 动态条件查询电影
    /*
    * @Param area 地区可为 null
    * @Param type 类型可为 null
    * @return 电影列表
    * */
    public List<Movie> selectByCategory(String area, String type);

    // 获得当前用户下所有收藏的电影
    public List<Movie> getAllMovieByUname(String uname);
}
