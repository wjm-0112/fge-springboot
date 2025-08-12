package com.neu.biz;

import com.neu.entity.Rating;

import java.util.List;

public interface RateBiz {
    public List<Rating> findRate(int index, int size);
}
