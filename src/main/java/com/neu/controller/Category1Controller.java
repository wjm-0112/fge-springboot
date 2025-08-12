package com.neu.controller;

import com.neu.biz.Category1Biz;
import com.neu.entity.Category1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("category1")
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
public class Category1Controller {
    @Autowired
    private Category1Biz category1Biz;

    @RequestMapping(value = "/findCategory1")
    @ResponseBody
    public Map<String,Object> findCategory1(Integer index){
        if (index == null) index = 1;
        int size = 5;
        List<Category1> list = category1Biz.findCategory1(index, size);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("list", list);
        map.put("index", index);
        return map;
    }

    @RequestMapping(value = "/getAllCategory1")
    @ResponseBody
    public List<Category1> getAllCategory1(){
        List<Category1> list = category1Biz.getAllCategory1();
        return list;
    }

    @RequestMapping(value = "/delCategory1")
    @ResponseBody
    public boolean delCategory1(int cid){
        boolean flag = category1Biz.delCategory1(cid);
        return flag;
    }

    @RequestMapping(value = "/findById")
    @ResponseBody
    public Category1 findById(int cid){
        Category1 category1 = category1Biz.findById(cid);
        return category1;
    }

    @RequestMapping(value = "/updateCategory1")
    @ResponseBody
    public boolean updateCategory1(int cid, String area){
        Category1 category1 = new Category1(cid, area);
        boolean flag = category1Biz.updateCategory1(category1);
        return flag;
    }

    @RequestMapping(value = "/addCategory1")
    @ResponseBody
    public boolean addCategory1(int cid, String area){
        Category1 category1 = new Category1(cid, area);
        boolean flag = category1Biz.addCategory1(category1);
        return flag;
    }
}
