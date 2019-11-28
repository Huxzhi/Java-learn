package bjpowernode.chapter06.fileinputoutstream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 以字节为单位读取文件的内容
 *
 * @author Huxzhi
 * @date 2019/11/25
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        //1)在当前程序与指定的文件之间建立流通道
        //读取d:/abc.txt文件的内容，通过构造方法指定要访问的文件，如果文件不存在会抛出异常
        FileInputStream fis = new FileInputStream("d:/abc.txt");

        //2）读写文件内容
        //read（）方法从文件中读取一个字节，并把讲到的字节返回，讲到文件末尾返回-1
        int cc = fis.read();
        while (cc != -1) {
            System.out.print((char) cc);
            cc = fis.read();
        }
        //3)关闭流通道
        fis.close();
    }
}
