package com.neu.controller;

import com.neu.biz.CommentBiz;
import com.neu.entity.*;
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
@RequestMapping("comment")
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
public class CommentController {
    @Autowired
    private CommentBiz commentBiz;

    @RequestMapping(value = "/getAllComment")
    @ResponseBody
    public List<Comment> getAllComment(){
        return commentBiz.getAllComment();
    }

    @RequestMapping(value = "/findComment")
    @ResponseBody
    public Map<String,Object> findComment(Integer index){
        if (index == null) index = 1;
        int size = 5;
        List<Comment> list = commentBiz.findComment(index, size);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("list", list);
        map.put("index", index);
        return map;
    }

    @RequestMapping(value = "/findCommentMo")
    @ResponseBody
    public Map<String,Object> findCommentMo(Integer index, int mid){
        if (index == null) index = 1;
        int size = 5;
        List<Comment> list = commentBiz.findCommentMo(index, size, mid);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("list", list);
        map.put("index", index);
        map.put("mid", mid);
        return map;
    }

    @RequestMapping(value = "/findCommentMo1")
    @ResponseBody
    public Map<String,Object> findCommentMo1(Integer index, String mname){
        if (index == null) index = 1;
        int size = 5;
        List<Comment> list = commentBiz.findCommentMo1(index, size, mname);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("list", list);
        map.put("index", index);
        map.put("mname", mname);
        return map;
    }

    @RequestMapping(value = "/delComment")
    @ResponseBody
    public boolean delComment(int cid){
        return commentBiz.delComment(cid);
    }

    @RequestMapping(value = "/findById")
    @ResponseBody
    public Comment findById(int cid){
        return commentBiz.findById(cid);
    }

    @RequestMapping(value = "/updateComment")
    @ResponseBody
    public boolean updateComment(int cid, String uname, int mid, String mname, String content, Date ctime){
        Movie m1 = new Movie();
        m1.setMid(mid);
        Comment comment = new Comment(cid, uname, m1, mname,content, ctime);
    	return commentBiz.updateComment(comment);
    }

    @RequestMapping(value = "/addComment")
    @ResponseBody
    public boolean addComment(String uname, int mid, String mname, String content, Date ctime){
        Movie m1 = new Movie();
        m1.setMid(mid);
        Comment comment = new Comment(uname, m1, mname,content, ctime);
    	return commentBiz.addComment(comment);
    }

    @RequestMapping(value = "/getAllCommentByUname")
    @ResponseBody
    public List<Comment> getAllCommentByUname(String uname){
    	return commentBiz.getAllCommentByUname(uname);
    }

    @RequestMapping(value = "/selectCommentsByUser")
    @ResponseBody
    public List<CommentMovieVO> selectCommentsByUser(String uname) {
        return commentBiz.getUserComments(uname);
    }
}
