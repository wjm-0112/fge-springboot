package com.neu.controller;

import com.neu.biz.MovieVoBiz;
import com.neu.entity.MovieVo;
import com.neu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("movieVo")
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
public class MovieVoController {
    @Autowired
    private MovieVoBiz movieVoBiz;

    @RequestMapping(value = "/getAllMovieVo")
    @ResponseBody
    public List<MovieVo> getAllMovieVo() {
        return movieVoBiz.getAllMovieVo();
    }
}
