package com.neu.biz.impl;

import com.neu.biz.CommentBiz;
import com.neu.entity.Comment;
import com.neu.entity.CommentMovieVO;
import com.neu.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("commentBiz")
public class CommentBizImpl implements CommentBiz {
    @Autowired
    private CommentMapper commentMapper;
    @Override
    public List<Comment> getAllComment() {
        return commentMapper.getAllComment();
    }

    @Override
    public List<Comment> findComment(int index, int size) {
        Map<String,Object> map = new HashMap<String,Object>();
        int pageNo = (index - 1) * size;
        map.put("index", pageNo);
        map.put("size", size);
        List<Comment> list = commentMapper.findComment(map);
        return list;
    }

    @Override
    public List<Comment> findCommentMo(int index, int size, int mid) {
        Map<String,Object> map = new HashMap<String,Object>();
        int pageNo = (index - 1) * size;
        map.put("index", pageNo);
        map.put("size", size);
        map.put("mid", mid);
        List<Comment> list = commentMapper.findCommentMo(map);
        return list;
    }

    @Override
    public List<Comment> findCommentMo1(int index, int size, String mname) {
        Map<String,Object> map = new HashMap<String,Object>();
        int pageNo = (index - 1) * size;
        map.put("index", pageNo);
        map.put("size", size);
        map.put("mname", mname);
        List<Comment> list = commentMapper.findCommentMo1(map);
        return list;
    }

    @Override
    public boolean delComment(int cid) {
        return commentMapper.delComment(cid);
    }

    @Override
    public Comment findById(int cid) {
        return commentMapper.findById(cid);
    }

    @Override
    public boolean updateComment(Comment comment) {
        return commentMapper.updateComment(comment);
    }

    @Override
    public boolean addComment(Comment comment) {
        return commentMapper.addComment(comment);
    }

    @Override
    public List<Comment> getAllCommentByUname(String uname) {
        return commentMapper.getAllCommentByUname(uname);
    }

    @Override
    public List<CommentMovieVO> getUserComments(String uname) {
        return commentMapper.selectCommentsByUser(uname);
    }


}
