package com.neu.mapper;

import com.neu.entity.Category1;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface Category1Mapper {
    // 查询一级分类列表
    public List<Category1> findAll(Map<String,Object> map);
    public List<Category1> findAll1();
    // 删除一级分类
    public boolean delCategory1(int cid);
    // 根据 id 查询数据
    public Category1 findById(int cid);
    // 修改一级分类
    public boolean updateCategory1(Category1 category1);
    // 添加一级分类
    public boolean addCategory1(Category1 category1);
}
