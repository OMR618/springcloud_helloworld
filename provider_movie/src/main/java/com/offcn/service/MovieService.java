package com.offcn.service;

import com.offcn.dao.MovieDao;
import com.offcn.pojo.Movie;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program: springcloud_helloworld
 * @description
 * @author: LiDuo
 * @create: 2020-10-21 16:18
 **/
public interface MovieService {
    public Movie getgetNewMovie();
}
