package com.yc.visual_programming.service;



import bean.Answer;
import com.yc.visual_programming.pojo.ExecUtil;
import org.springframework.stereotype.Service;
import java.io.FileWriter;
import java.io.IOException;

@Service
public class TestService {
    private Boolean javaLock=true;
    public Answer run(String code){
        String DIR="D:/Java_code/LeetCode/";
        String javaFile=DIR+"Main.java";
        String javaClass="Main";
        //编译命令
        String compileCmd=String.format("javac -encoding utf8 %s -d %s",javaFile,DIR);
        //运行命令
        String runningCmd=String.format("java -classpath %s %s", DIR, javaClass);
        //将代码写入到定义路径下特定的java源文件中
        synchronized (javaLock) {
            FileWriter writer = null;
            try {
                writer = new FileWriter(javaFile);
                writer.write(code);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
            //编译源文件为class文件
            Answer answer = ExecUtil.run(compileCmd, false, true);
            System.out.println(answer.getStderr());
            //若编译成功即可开始运行
            if (answer.getError() == 0) {
                answer = ExecUtil.run(runningCmd, true, true);
                if (answer.getError() == 0)
                    answer.setReason(Answer.Success);
                else
                    answer.setReason(Answer.RuntimeError);
                System.out.println(answer.getStdout());
            } else
                answer.setReason(Answer.Error);
            return answer;
        }
    }
}
