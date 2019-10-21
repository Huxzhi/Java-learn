package bjpowernode.chapter04.string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * String的基本操作
 *
 * @author Huxzhi
 * @date 2019/10/2
 */
public class Test02 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s1 = "hello,word";
        //1)一个一个字符打印，charAt()返回索引值得字符
        for (int i = 0; i < s1.length(); i++) {
            System.out.print(s1.charAt(i));
        }
        System.out.println();

        //2)String类实现Comparable接口，并重写Compareto方法
        //比较第一个不同字符的码值，相差-4，
        System.out.println("hehe".compareTo("hello"));
        System.out.println("张三".compareTo("李四"));

        //3)format("格式串"，格式化的数据)
        System.out.println(String.format("name:%s,age:%d,婚否:%b,工资:%f", "feifei", 18, false, 3220.0));

        //4)字符串转换为字节数组
        byte[] bytesss = "hello,动力节点".getBytes();
        System.out.println(Arrays.toString(bytesss));
        bytesss = "hello,动力节点".getBytes("GBK");
        System.out.println(Arrays.toString(bytesss));

        //5)把字符串的路径，文件名，扩展名分别分离出
        String text = "D:\\IdeaProjects\\java-learn\\out\\production\\java-learn\\bjpowernode\\chapter04.java";
        int lastslashIndex = text.lastIndexOf("\\");
        int dotIndex = text.indexOf(".");
        String folder = text.substring(0, lastslashIndex);
        String filename = text.substring(lastslashIndex + 1, dotIndex);
        String suffix = text.substring(dotIndex + 1);
        System.out.println(folder);
        System.out.println(filename);
        System.out.println(suffix);

        //6)trim()去掉前后的空白字符
        text = "           hello          world              ";
        text = text.trim();
        //AAAhello          worldBBB
        System.out.println("AAA" + text + "BBB");

        //7) valueOf()把其他类型数据转换成字符串
        int num = 456;
        text = "" + num;
        text = String.valueOf(num);

        //8) toCharArray
        char[] content = text.toCharArray();
        System.out.println(content[2]);
    }
}
