package com.yc.visual_programming;

import com.yc.visual_programming.dao.CodeListDao;
import com.yc.visual_programming.pojo.code_list;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class VisualProgrammingApplicationTests {
    @Autowired
    private CodeListDao codeListDao;
    @Test
    void contextLoads() {
        List<code_list> list=codeListDao.listQuestions();
        for(code_list c:list){
            System.out.println(c.getId()+":"+c.getTitle()+":"+c.getDescribtion());
        }
    }

}
