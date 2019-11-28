package bjpowernode.chapter06.fileinputoutstream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 异常处理
 *
 * @author Huxzhi
 * @date 2019/11/26
 */
public class Test06 {
    public static void main(String[] args) {
        m1();       //一次读取一个字节，手动关闭流，异常处理
        m2();       //从文件中读取字节保存到字节数组中，异常处理，自动关闭流
    }

    private static void m2() {
        //从JDK7开始，流可以自动关闭
        try (//try资源块，自动释放
             FileInputStream fis = new FileInputStream("d:/abc.txt");
        ) {
            byte[] bytes = new byte[4];
            int len = fis.read(bytes);
            while (len != -1) {
                System.out.print(new String(bytes, 0, len));
                len = fis.read(bytes);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void m1() {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("d:/abc.txt");
            int cc = fis.read();
            while (cc != -1) {
                System.out.print((char) cc);
                cc = fis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //关闭流，释放系统资源
        }

    }
}
