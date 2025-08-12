package com.neu.controller;

import com.neu.biz.Category2Biz;
import com.neu.entity.Category2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("category2")
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
public class Category2Controller {
    @Autowired
    private Category2Biz category2Biz;

    @RequestMapping(value = "/findCategory2")
    @ResponseBody
    public Map<String,Object> findCategory2(Integer index){
        if (index == null) index = 1;
        int size = 5;
        List<Category2> list = category2Biz.findAll(index, size);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("list", list);
        map.put("index", index);
        return map;
    }

    @RequestMapping(value = "/getAllCategory2")
    @ResponseBody
    public List<Category2> getAllCategory2(){
        List<Category2> list = category2Biz.findAll1();
        return list;
    }

    @RequestMapping(value = "/findCategory2Mo")
    @ResponseBody
    public Map<String,Object> findCategory2Mo(Integer index, String type){
        if (index == null) index = 1;
        int size = 5;
        List<Category2> list = category2Biz.findCategory2Mo(index, size, type);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("list", list);
        map.put("index", index);
        map.put("type", type);
        return map;
    }

    @RequestMapping(value = "/delCategory2")
    @ResponseBody
    public boolean delCategory2(int ccid){
        boolean flag = category2Biz.delCategory2(ccid);
        return flag;
    }

    @RequestMapping(value = "/findById")
    @ResponseBody
    public Category2 findById(int ccid){
        Category2 category2 = category2Biz.findById(ccid);
        return category2;
    }

    @RequestMapping(value = "/updateCategory2")
    @ResponseBody
    public boolean updateCategory2(int ccid, String type){
        Category2 category2 = new Category2(ccid, type);
        return category2Biz.updateCategory2(category2);
    }

    @RequestMapping(value = "/addCategory2")
    @ResponseBody
    public boolean addCategory2(int ccid, String type){
        Category2 category2 = new Category2(ccid,type);
        return category2Biz.addCategory2(category2);
    }
}
