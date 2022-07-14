package com.yc.visual_programming.controller;

import bean.Answer;
import com.alibaba.fastjson.JSONObject;
import com.yc.visual_programming.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/tol",produces = "application/json;charset=UTF-8")
public class TestController {

    TestService service;
    @Autowired
    public void setService(TestService service) {
        this.service = service;
    }
    @RequestMapping(value = "/run")
    public String run(@RequestBody JSONObject json){
        Answer answer=service.run(json.getString("code"));
        if(answer==null)
            return "{\"error\":\"IO错误\"}";
        else
            return JSONObject.toJSONString(answer);
    }
}
