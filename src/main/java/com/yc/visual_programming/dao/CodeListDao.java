package com.yc.visual_programming.dao;

import com.yc.visual_programming.pojo.code_list;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CodeListDao {
    //查询所有题目
    public List<code_list> listQuestions();
    //跟据id查询题目
    public List<code_list> listQuestionsByTitle(String name);
}
