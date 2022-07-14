package com.yc.visual_programming.service;

import com.yc.visual_programming.dao.CodeListDao;
import com.yc.visual_programming.pojo.code_list;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CodeListServiceImpl implements CodeListService{
    @Autowired
    private CodeListDao codeListDao;
    @Override
    public List<code_list> listQuestions() {
        return codeListDao.listQuestions();
    }

    @Override
    public List<code_list> listQuestionsByTitle(String name) {
        return codeListDao.listQuestionsByTitle(name);
    }
}
