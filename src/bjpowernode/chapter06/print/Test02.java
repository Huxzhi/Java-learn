package bjpowernode.chapter06.print;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * PrintWriter
 * 以字符为单位的打印流
 *
 * @author Huxzhi
 * @date 2019/11/28
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("d:/def.txt"));
        pw.print("这是字符打印流");
        try {
            FileInputStream fis = new FileInputStream("h:/sad.dsf");
        } catch (Exception e) {
            e.printStackTrace(pw);
        }
        pw.close();
    }
}
