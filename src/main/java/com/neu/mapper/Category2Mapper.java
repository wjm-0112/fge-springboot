package com.neu.mapper;

import com.neu.entity.Category2;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface Category2Mapper {
    public List<Category2> findAll(Map<String,Object> map);
    public List<Category2> findAll1();
    public List<Category2> findCategory2Mo(Map<String,Object> map);
    public boolean delCategory2(int ccid);
    public Category2 findById(int ccid);
    public boolean updateCategory2(Category2 category2);
    public boolean addCategory2(Category2 category2);
}
