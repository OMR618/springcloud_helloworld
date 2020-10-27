package com.offcn.dao;

import com.offcn.pojo.Movie;
import org.springframework.stereotype.Repository;

/**
 * @program: springcloud_helloworld
 * @description
 * @author: LiDuo
 * @create: 2020-10-21 16:12
 **/
@Repository
public class MovieDao {
    public Movie getNewMovie(){
        Movie movie = new Movie(1L, "我和我的家乡");
        return movie;
    }
}
