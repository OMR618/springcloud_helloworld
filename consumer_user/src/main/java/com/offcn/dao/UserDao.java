package com.offcn.dao;

import com.offcn.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * @program: springcloud_helloworld
 * @description
 * @author: LiDuo
 * @create: 2020-10-21 17:03
 **/
@Repository
public class UserDao {

    public User getUserById(Long id){
        User user = new User(id, "张三");
        return user;
    }
}
