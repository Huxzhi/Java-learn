package bjpowernode.chapter06.objectinputoutput;
/**
 * 对象序列化
 *
 * @author Huxzhi
 * @date 2019/11/28
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Test01 {
    public static void main(String[] args) throws IOException {
        Person p1 = new Person("yongge", 36);
        //对象序列化，把p1对象保存到文件d:/obj.txt
        OutputStream out = new FileOutputStream("d:/obj.txt");
        ObjectOutputStream oos = new ObjectOutputStream(out);

        oos.writeObject(p1);
        oos.close();
    }
}
