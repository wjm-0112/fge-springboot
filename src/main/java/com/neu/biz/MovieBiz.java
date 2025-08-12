package com.neu.biz;

import com.neu.entity.Movie;

import java.util.List;

public interface MovieBiz {
    public List<Movie> findMovie(int index, int size);
    public List<Movie> findAll();
    public List<Movie> findMovieMo(int index, int size, String name);
    public boolean delMovie(int mid);
    public Movie findById(int mid);
    public boolean updateMovie(Movie movie);
    public boolean addMovie(Movie movie);
    public List<Movie> selectByCategory(String area, String type);
}
