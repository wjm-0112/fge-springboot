package com.neu.biz;

import com.neu.entity.Comment;
import com.neu.entity.CommentMovieVO;

import java.util.List;

public interface CommentBiz {
    List<Comment> getAllComment();

    public List<Comment> findComment(int index, int size);
//    模糊查询
    public List<Comment> findCommentMo(int index, int size, int mid);
    public List<Comment> findCommentMo1(int index, int size, String mname);
    public boolean delComment(int cid);
    public Comment findById(int cid);
    public boolean updateComment(Comment comment);
    public boolean addComment(Comment comment);

    public List<Comment> getAllCommentByUname(String uname);

    List<CommentMovieVO> getUserComments(String uname);

}
