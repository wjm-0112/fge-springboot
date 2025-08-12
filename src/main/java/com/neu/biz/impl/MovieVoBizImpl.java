package com.neu.biz.impl;

import com.neu.biz.MovieVoBiz;
import com.neu.entity.MovieVo;
import com.neu.entity.User;
import com.neu.mapper.MovieVoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("movieVoBiz")
public class MovieVoBizImpl implements MovieVoBiz {
    @Autowired
    private MovieVoMapper movieVoMapper;

    @Override
    public List<MovieVo> getAllMovieVo() {
        return movieVoMapper.getAllMovieVo();
    }
}
