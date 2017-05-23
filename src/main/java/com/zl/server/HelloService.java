package com.zl.server;

import org.springframework.stereotype.Service;

/**
 * Created by THINK on 2017/5/11.
 */
@Service
public class HelloService {
    public String getBill(int id){
        return "test service is ok";
    }
}
