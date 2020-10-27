package com.offcn.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: springcloud_helloworld
 * @description
 * @author: LiDuo
 * @create: 2020-10-21 16:13
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie implements Serializable {
    private Long id;
    private String movieName;
}
