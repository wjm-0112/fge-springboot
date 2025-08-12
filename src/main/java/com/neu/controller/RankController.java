package com.neu.controller;

import com.neu.biz.RankBiz;
import com.neu.entity.Movie;
import com.neu.entity.Rank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("rank")
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
public class RankController {
    @Autowired
    private RankBiz rankBiz;

    @RequestMapping(value = "/findRank")
    @ResponseBody
    public Map<String,Object> findRank(Integer index) {
        if (index == null) index = 1;
        int size = 5;
        List<Rank> list = rankBiz.findRank(index, size);
    	Map<String,Object> map = new HashMap<String,Object>();
        map.put("list", list);
        map.put("index", index);
    	return map;
    }

    @RequestMapping(value = "/findRankMo")
    @ResponseBody
    public Map<String,Object> findRankMo(Integer index, String name) {
        if (index == null) index = 1;
        int size = 5;
        List<Rank> list = rankBiz.findRankMo(index, size, name);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("list", list);
        map.put("index", index);
        return map;
    }

    @RequestMapping(value = "/delRank")
    @ResponseBody
    public boolean delRank(int rid) {
    	return rankBiz.delRank(rid);
    }

    @RequestMapping(value = "/addRank")
    @ResponseBody
    public boolean addRank(int rid, String name, double score, int collection) {
        Rank rank = new Rank(rid, name, score, collection);
        return rankBiz.addRank(rank);
    }

    @RequestMapping(value = "/findById")
    @ResponseBody
    public Rank findById(int rid) {
        Rank rank = rankBiz.findById(rid);
        return rank;
    }

    @RequestMapping(value = "/updateRank")
    @ResponseBody
    public boolean updateRank(int rid, String name, double score, int collection) {
        Rank rank = new Rank(rid, name, score, collection);
        return rankBiz.updateRank(rank);
    }
}
