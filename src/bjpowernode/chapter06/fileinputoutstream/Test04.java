package bjpowernode.chapter06.fileinputoutstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * 一次读取一个字节数组
 * 读取很多字节保存到字节数组中
 *
 * @author Huxzhi
 * @date 2019/11/26
 */
public class Test04 {
    public static void main(String[] args) throws IOException {
        //1)在当前程序与指定的文件之间建立流通道
        FileInputStream fis = new FileInputStream("d:/abc.txt");

        byte[] bytes = new byte[4];

        //从流中读取很多字节，保存到字节数组中，返回读到的字节数
        int len = fis.read(bytes);
        System.out.println(len);
        System.out.println(Arrays.toString(bytes));

        len = fis.read(bytes);
        System.out.println(len);
        System.out.println(Arrays.toString(bytes));

        len = fis.read(bytes);
        System.out.println(len);
        System.out.println(Arrays.toString(bytes));

        fis.close();
    }
}
