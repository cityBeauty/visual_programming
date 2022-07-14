package com.yc.visual_programming.service;

import com.yc.visual_programming.pojo.code_list;

import java.util.List;

public interface CodeListService {
    //查询所有题目
    public List<code_list> listQuestions();
    //跟据id查询题目
    public List<code_list> listQuestionsByTitle(String name);
}
