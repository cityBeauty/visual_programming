package com.yc.visual_programming.controller;

import com.yc.visual_programming.dao.CodeListDao;
import com.yc.visual_programming.pojo.code_list;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class achive_test_questions {
    @Autowired
    CodeListDao codeListDao;
    @RequestMapping("/api/getQuestions")
    public List<code_list> getUsers(){
        System.out.println("hello:");
         List<code_list> list= codeListDao.listQuestions();
        return list;
    }

}
