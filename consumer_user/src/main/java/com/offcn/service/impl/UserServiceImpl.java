package com.offcn.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.offcn.dao.UserDao;
import com.offcn.pojo.Movie;
import com.offcn.pojo.User;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: springcloud_helloworld
 * @description
 * @author: LiDuo
 * @create: 2020-10-21 17:06
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    @HystrixCommand(fallbackMethod = "buyMovieFallbackMethod")
    public Map<String, Object> buyMovie(Long userId) {
        Map<String, Object> resultMap = new HashMap<>();
        User user = this.getUserById(userId);
        //远程调用电影服务接口
        Movie movie = restTemplate.getForObject("http://PROVIDERMOVIE/movie/getNewMovie", Movie.class);
        resultMap.put("user",user);
        resultMap.put("movie",movie);
        return resultMap;
    }

    public Map<String,Object> buyMovieFallbackMethod(Long id){
        User user = new User();
        user.setId(-1L);
        user.setName("未知用户");
        Movie movie = new Movie();
        movie.setId(-100L);
        movie.setMovieName("无此电影");
        Map<String,Object> result = new HashMap<>();
        result.put("user",user);
        result.put("movice",movie);
        return result;
    }

}
