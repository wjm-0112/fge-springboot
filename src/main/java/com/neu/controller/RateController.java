package com.neu.controller;

import com.neu.biz.RateBiz;
import com.neu.entity.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("rate")
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
public class RateController {
    @Autowired
    private RateBiz rateBiz;

    @RequestMapping(value = "/findRate")
    @ResponseBody
    public Map<String,Object> findRate(Integer index) {
        if (index == null) index = 1;
        int size = 5;
        List<Rating> list = rateBiz.findRate(index, size);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("list", list);
        map.put("index", index);
        return map;
    }
}
