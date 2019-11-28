package bjpowernode.chapter06.readerwiter;

import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader/FileWriter
 * 以字符为单位读写文件内容,只能读写纯文本文件，要求文本文件的编码格式要与
 *
 * @author Huxzhi
 * @date 2019/11/27
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        //通过FileReader读取文件内容,一次读取一个字符
        //m1();
        //读取文本文件内容，一次读取一个字符数组，异常处理，自动关闭
        m2();
    }

    private static void m2() {
        try (FileReader fr = new FileReader("d:/test08.java");) {
            char[] contents = new char[1024];
            int len = fr.read(contents);
            while (len != -1) {
                System.out.println(new String(contents, 0, len));
                len = fr.read(contents);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void m1() throws IOException {
        //建立流通道
        //FileReader fr = new FileReader("d:/abc.txt");
        //abc.txt虽然是GBK编码，当前环境是UTF8编码，abc.txt文件中都是英文字符，英文字符不管是GBK还是UTF8编码都是一个字
        //如果文件是GBK格式，文件中有中文，读取时会出现乱码

        //一般使用FileReader读取与当前环境编码一致的文件
        FileReader fr = new FileReader("d:/test08.java");

        //read()一次读取一个字符，返回字符的码值，读到文件末尾返回-1
        int cc = fr.read();
        while (cc != -1) {
            System.out.print((char) cc);
            cc = fr.read();
        }
        fr.close();

    }
}
