package com.neu.mapper;

import com.neu.entity.Comment;
import com.neu.entity.CommentMovieVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface CommentMapper {
    public List<Comment> findComment(Map<String,Object> map);
    public List<Comment> findCommentMo(Map<String,Object> map);
    public List<Comment> findCommentMo1(Map<String,Object> map);
    public boolean delComment(int cid);
    public Comment findById(int cid);
    public boolean updateComment(Comment comment);
    public boolean addComment(Comment comment);
    List<Comment> getAllComment();

    // 查询当前用户下所有电影评论
    List<Comment> getAllCommentByUname(String uname);

    List<CommentMovieVO> selectCommentsByUser(@Param("uname") String uname);

}
