package com.offcn.service.impl;

import com.offcn.dao.UserDao;
import com.offcn.pojo.Movie;
import com.offcn.pojo.User;
import com.offcn.service.MovieServerFeign;
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
    private MovieServerFeign movieServerFeign;

    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    public Map<String, Object> buyMovie(Long userId) {
        Map<String, Object> resultMap = new HashMap<>();
        User user = this.getUserById(userId);
        //远程调用电影服务接口
        Movie movie = movieServerFeign.getNewMovie();
        resultMap.put("user",user);
        resultMap.put("movie",movie);
        return resultMap;
    }
}
