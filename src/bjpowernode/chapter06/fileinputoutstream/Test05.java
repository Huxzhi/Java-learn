package bjpowernode.chapter06.fileinputoutstream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 一次读取一个字节数组
 * 读取很多字节保存到字节数组中
 *
 * @author Huxzhi
 * @date 2019/11/26
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        //1)在当前程序与指定的文件之间建立流通道
        FileInputStream fis = new FileInputStream("d:/abc.txt");

        byte[] bytes = new byte[4];

        //从流中读取很多字节，保存到字节数组中，返回读到的字节数
        int len = fis.read(bytes);

        while (len != -1) {
            //从文件中读取了len个字节保存到了bytes数组中，对len个字节进行处理
            //把读到的len个字节转换为字符串 new String（byte[]bytes，0，len）
            System.out.print(new String(bytes, 0, len));
            //继续读
            len = fis.read(bytes);
        }

        fis.close();
    }
}
