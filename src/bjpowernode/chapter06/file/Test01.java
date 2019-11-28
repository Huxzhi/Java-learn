package bjpowernode.chapter06.file;

import java.io.File;
import java.io.IOException;

/**
 * 创建File对象
 *
 * @author Huxzhi
 * @date 2019/11/28
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("d:/java");
        //创建文件夹
        f1.mkdir();

        File f2 = new File("d:/java/sub1");
        f2.mkdir();

        File f3 = new File("d:/java", "sub2");
        //创建文件
        f3.createNewFile();

        File f4 = new File(f2, "sub3");
        f4.createNewFile();
    }
}
