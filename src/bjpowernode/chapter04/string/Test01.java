package bjpowernode.chapter04.string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * 创建String
 *
 * @author Huxzhi
 * @date 2019/10/2
 */
public class Test01 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //1)直接赋值
        String s1 = "hello";

        //2)无参构造
        String s2 = new String();
        System.out.println(s2 == null);
        /*new运算符在堆中创建一个String对象，把该对象的引用（地址）保存到s2变量中
         *s2是一个空串，是一个字符个数为0的字符串，相当于""
         */

        //3)
        byte[] bytes = {65, 66, 67, 97, 98, 99};
        String s3 = new String(bytes);
        System.out.println(s3);
        //ABCabc
        //把字符数组转换成字符串
        s3 = new String(bytes, 2, 3);
        System.out.println(s3);
        //Cab
        //String字符串的getBytes()方法，可以当前默编码(UTF-8)转换为字节数组
        bytes = "hello,动力节点".getBytes();
        System.out.println(Arrays.toString(bytes));
        //[104, 101, 108, 108, 111, 44, -27, -118, -88, -27, -118, -101, -24, -118, -126, -25, -126, -71]
        //字节按GBK编码转换字符串
        s3 = new String(bytes, "GBK");
        System.out.println(s3);
        //hello,鍔ㄥ姏鑺傜偣
        s3 = new String(bytes, "UTF-8");
        //hello,动力节点
        System.out.println(s3);
        //4)根据字符数组创建字符串
        char[] contents = {'A', 'B', '汉', '字', 30028, 30068};
        //  char 最大65535
        String s4 = new String(contents);
        System.out.println(s4);
        //AB汉字界畴
        contents = "hello,动力节点".toCharArray();
        System.out.println(Arrays.toString(contents));

        String s6 = new String(s4);
        System.out.println(s6);
        System.out.println(s6 == s4);
        //false
    }
}
