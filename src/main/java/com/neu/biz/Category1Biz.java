package com.neu.biz;

import com.neu.entity.Category1;

import java.util.List;

public interface Category1Biz {
    public List<Category1> findCategory1(int index, int size);
    List<Category1> getAllCategory1();
    public boolean delCategory1(int c1Id);
    public Category1 findById(int c1Id);
    public boolean updateCategory1(Category1 category1);
    public boolean addCategory1(Category1 category1);
}
