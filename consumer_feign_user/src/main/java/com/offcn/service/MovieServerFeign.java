package com.offcn.service;

import com.offcn.pojo.Movie;
import com.offcn.service.impl.MovieServerFeignImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: springcloud_helloworld
 * @description
 * @author: LiDuo
 * @create: 2020-10-21 19:36
 **/
@FeignClient(value = "PROVIDERMOVIE",fallback = MovieServerFeignImpl.class)
public interface MovieServerFeign {

    @GetMapping("/movie/getNewMovie")
    public Movie getNewMovie();
}
