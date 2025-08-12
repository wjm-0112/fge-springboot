package com.neu.controller;

import com.neu.biz.MovieBiz;
import com.neu.entity.Category1;
import com.neu.entity.Category2;
import com.neu.entity.Movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("movie")
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
public class MovieController {
    @Autowired
    private MovieBiz movieBiz;

    @RequestMapping(value = "/findMovie")
    @ResponseBody
    public Map<String,Object> findMovie(Integer index) {
        if (index == null) index = 1;
        int size = 5;
        List<Movie> list = movieBiz.findMovie(index, size);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("list", list);
        map.put("index", index);
        return map;
    }

    @RequestMapping(value = "/getAllMovie")
    @ResponseBody
    public List<Movie> getAllMovie() {
        List<Movie> list = movieBiz.findAll();
        return list;
    }

    @RequestMapping(value = "/findMovieMo")
    @ResponseBody
    public Map<String,Object> findMovieMo(Integer index, String name) {
        if (index == null) index = 1;
        int size = 10;
        List<Movie> list = movieBiz.findMovieMo(index, size, name);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("list", list);
        map.put("index", index);
        map.put("name", name);
        return map;
    }

    @RequestMapping(value = "/delMovie")
    @ResponseBody
    public boolean delMovie(int mid) {
        boolean flag = movieBiz.delMovie(mid);
        return flag;
    }

    @RequestMapping(value = "/findById")
    @ResponseBody
    public Movie findById(int mid) {
        Movie movie = movieBiz.findById(mid);
        return movie;
    }

    @RequestMapping(value = "/updateMovie")
    @ResponseBody
    public boolean updateMovie(int mid, String name, int time, String director, String actor, String area, String type, String description, double score, int collection, int seen, Date year, String poster) {
        Category1 c1 = new Category1();
        c1.setArea(area);
        Category2 c2 = new Category2();
        c2.setType(type);
        Movie movie = new Movie(mid,name,time,director,actor,c1,c2,description,score,collection,seen,year,poster);
        return movieBiz.updateMovie(movie);
    }

    @RequestMapping(value = "/addMovie")
    @ResponseBody
    public boolean addMovie(int mid, String name, int time, String director, String actor, String area, String type, String description, double score, int collection, int seen, Date year, String poster){
        Category1 c1 = new Category1();
        c1.setArea(area);
        Category2 c2 = new Category2();
        c2.setType(type);
        Movie movie = new Movie(mid, name, time, director, actor, c1, c2, description, score, collection, seen, year, poster);
        return movieBiz.addMovie(movie);
    }

    @RequestMapping(value = "/selectByCategory")
    @ResponseBody
    public List<Movie> selectByCategory(String area, String type) {
        return movieBiz.selectByCategory(area, type);
    }
}
