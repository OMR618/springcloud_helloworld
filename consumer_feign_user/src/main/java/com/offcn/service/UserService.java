package com.offcn.service;

import com.offcn.pojo.User;

import java.util.Map;

/**
 * @program: springcloud_helloworld
 * @description
 * @author: LiDuo
 * @create: 2020-10-21 17:05
 **/
public interface UserService {
    public User getUserById(Long id);

    public Map<String, Object> buyMovie(Long userId);
}
