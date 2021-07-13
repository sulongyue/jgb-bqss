package com.bqss.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jinguobiao
 * @date 2021/7/13
 * @description
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/test1")
    public Map<String,Object> test(){
        Map<String,Object> resMap = new HashMap<>();
        resMap.put("code",1);
        resMap.put("msg", "success");
        return resMap;
    }
}
