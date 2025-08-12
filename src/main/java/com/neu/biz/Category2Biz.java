package com.neu.biz;

import com.neu.entity.Category2;

import java.util.List;

public interface Category2Biz {
    public List<Category2> findAll(int index, int size);
    List<Category2> findAll1();
    public List<Category2> findCategory2Mo(int index, int size,String type);
    public boolean delCategory2(int ccid);
    public Category2 findById(int ccid);
    public boolean updateCategory2(Category2 category2);
    public boolean addCategory2(Category2 category2);
}
