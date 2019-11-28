package bjpowernode.chapter06.objectinputoutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

/**
 * 对象反序列化
 * 简单的理解为把对象从文件中读取出来
 *
 * @author Huxzhi
 * @date 2019/11/28
 */
public class Test02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        InputStream in = new FileInputStream("d:/obj.txt");
        ObjectInputStream ois = new ObjectInputStream(in);
        //从文件中读取一个对象，obj是Object类型的，引用的是Person对象
        Object obj = ois.readObject();

        System.out.println(obj);
        ois.close();

        /**
         * 场景描述
         *      把对象序列化到文件后，又在Person类中添加了一个字段，再进行反序列化时，产生以下异常：
         * java.io.InvalidClassException:
         * bjpowernode.chapter06.objectinputoutput.Person; local class incompatible:
         * stream classdesc serialVersionUID = -2731201006448154473,
         * local class serialVersionUID = 2783491266771033952
         * 分析
         *      Person类实现了Serializable接口后，系统会给类自动添加一个serialVersionUID序列化版本号字段
         *      当在Person类添加/删除了一个字段，重新编译，serialVersionUID字段会生成一个新的值
         * 解决方法
         *      保证
         */
    }
}
