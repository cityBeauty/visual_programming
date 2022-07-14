package com.yc.visual_programming.utils;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.lang.reflect.Method;

public class myClassLoader {
    public void laod_class(){
        try {
            String dir=System.getProperty("code_list.dir");
            JavaCompiler compiler= ToolProvider.getSystemJavaCompiler();
            int res=compiler.run(null,null,null,"D:/Java code/leetcode_test/src/test01.java");
            System.out.println("res:"+res);
            Class clz = Class.forName("test");//返回与带有给定字符串名的类 或接口相关联的 Class 对象。
            Object o = clz.newInstance();
            Method method = clz.getDeclaredMethod("run");//返回一个 Method 对象，该对象反映此 Class 对象所表示的类或接口的指定已声明方法
            method.invoke(o);//静态方法第一个参数可为null,第二个参数为实际传参
            System.out.println(dir);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
