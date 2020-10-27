package com.offcn.service.impl;

import com.offcn.pojo.Movie;
import com.offcn.service.MovieServerFeign;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @program: springcloud_helloworld
 * @description
 * @author: LiDuo
 * @create: 2020-10-21 20:41
 **/
@Component
public class MovieServerFeignImpl implements MovieServerFeign {
    @Override
    public Movie getNewMovie() {
        return new Movie(-1L,"该电影未上映");
    }
}
