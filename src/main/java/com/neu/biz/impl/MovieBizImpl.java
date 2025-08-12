package com.neu.biz.impl;

import com.neu.biz.MovieBiz;
import com.neu.entity.Movie;
import com.neu.mapper.MovieMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("movieBiz")
public class MovieBizImpl implements MovieBiz {
    @Autowired
    private MovieMapper movieMapper;

    @Override
    public List<Movie> findMovie(int index, int size) {
        Map<String,Object> map = new HashMap<String,Object>();
        int pageNo = (index - 1) * size;
        map.put("index", pageNo);
        map.put("size", size);
        List<Movie> list = movieMapper.findMovie(map);
        return list;
    }

    @Override
    public List<Movie> findAll() {
        return movieMapper.findAll();
    }

    @Override
    public List<Movie> findMovieMo(int index, int size, String name) {
        Map<String,Object> map = new HashMap<String,Object>();
        int pageNo = (index - 1) * size;
        map.put("index", pageNo);
        map.put("size", size);
        map.put("name", name);
        List<Movie> list = movieMapper.findMovieMo(map);
        return list;
    }

    @Override
    public boolean delMovie(int mid) {
        return movieMapper.delMovie(mid);
    }

    @Override
    public Movie findById(int mid) {
        return movieMapper.findById(mid);
    }

    @Override
    public boolean updateMovie(Movie movie) {
        return movieMapper.updateMovie(movie);
    }

    @Override
    public boolean addMovie(Movie movie) {
        return movieMapper.addMovie(movie);
    }

    @Override
    public List<Movie> selectByCategory(String area, String type) {
        return movieMapper.selectByCategory(area, type);
    }
}
