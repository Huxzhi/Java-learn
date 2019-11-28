package bjpowernode.chapter06.fileinputoutstream;

import java.io.FileInputStream;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {
        //1)在当前程序与指定的文件之间建立流通道
        FileInputStream fis = new FileInputStream("d:/abc.txt");

        //2）读写文件内容
        fis.read();

        //3)关闭流通道
        fis.close();
    }
}
