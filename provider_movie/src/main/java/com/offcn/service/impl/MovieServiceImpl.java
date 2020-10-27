package com.offcn.service.impl;

import com.offcn.dao.MovieDao;
import com.offcn.pojo.Movie;
import com.offcn.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @program: springcloud_helloworld
 * @description
 * @author: LiDuo
 * @create: 2020-10-21 16:18
 **/
@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieDao movieDao;

    @Value("${server.port}")
    private String port;

    @Override
    public Movie getgetNewMovie() {
        System.out.println("port:"+port);
        return movieDao.getNewMovie();
    }
}
