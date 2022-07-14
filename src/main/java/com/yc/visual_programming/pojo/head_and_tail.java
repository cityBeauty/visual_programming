package com.yc.visual_programming.pojo;

public class head_and_tail {
    public String head=
            "import java.util.*;\n" +
            "import java.io.*;\n" +
            "import org.springframework.beans.factory.config.ConfigurableBeanFactory;\n" +
            "import org.springframework.context.annotation.ScopedProxyMode;\n" +
            "import org.springframework.stereotype.Component;\n" +
            "import org.springframework.context.annotation.Scope;\n" +
            "@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)\n" +
            "@Component\n" +
            "public class "+
            " test01{\n" +
            "    static final PrintStream printStream_def = System.out;\n" +
            "    public void run() {\n" +
            "    try {\n" +
            "        File f=new File(\"src/main/resources/public/test.txt\");\n" +
            "        FileOutputStream fileOutputStream = new FileOutputStream(f,true);\n" +
            "\n" +
            "        PrintStream printStream = new PrintStream(fileOutputStream);\n" +
            "        System.out.println(\"afsaad\");\n" +
            "        System.setOut(printStream);"+
            "\n";
    public String tail=
            "\n" +
            "        System.setOut(printStream_def);\n" +
                    "        fileOutputStream.close();\n" +
                    "        \n" +
                    "        System.out.println(\"已经结束了叻\");\n" +
                    "    } catch (Exception e) {\n" +
                    "        e.printStackTrace();\n" +
                    "    }finally {\n" +
                    "    }\n" +
            "        }\n" +
            "}";

    public head_and_tail() {
    }
}
