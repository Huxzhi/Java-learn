package bjpowernode.chapter06.fileinputoutstream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutputStream
 * 以字节为单位把数据保存到文件中
 *
 * @author Huxzhi
 * @date 2019/11/26
 */
public class Test07 {
    public static void main(String[] args) throws IOException {
        //建立流通道，通过构造方法的参数指定要访问的文件
        //如果访问的文件不存在，系统会创建一个新文件，如果文件已存在，会覆盖文件原来的内容
        //FileOutputStream fos = new FileOutputStream("d:/def.txt");
        //如果文件不存在就创建文件，如果文件已存在，把内容保存到文件的后面，即以追加的方式打开文件
        FileOutputStream fos = new FileOutputStream("d:/def.txt", true);
        //2)保存数据
        //一次写一个字节
        fos.write(65);
        fos.write(66);
        fos.write(67);
        //换行，在Windows操作系统中，换行需要使用\n\r两个字符
        fos.write('\r');
        //回车，13
        fos.write('\n');
        //换行，10
        //一次写一个字节数组
        byte[] bytes = "bjpowernode".getBytes();
        fos.write(bytes);
        fos.write(13);
        fos.write(10);
        //把字节数组的部分字节保存到文件中
        fos.write(bytes, 0, 2);

        //3)关闭流
        fos.close();
    }
}
