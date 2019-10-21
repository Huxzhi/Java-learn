package bjpowernode.chapter04.string;

/**
 * String字符串对象是不可变的，每次进行字符串连接都会生成新的字符串对
 *
 * @author Huxzhi
 * @date 2019/10/2
 */
public class Test05 {
    public static void main(String[] args) {
        String s1 = "hello";
        s1 = "hehe";
        /**
         * 注意：“hel1o"与"hehe"才是String对象，s1是String类型的变量
         * s1变量原来存储的是“hel1o”对象的引用，现在存储的是“hehe“对象的引用
         * 我们说String对象不可变是指不能把”hel1o“字符串变为"hehe"
         * 当执行s1="hehe“时，是在常量池中又添加了一个新的字符串对象“hehe"，把该对象的引用保存到s1中，常量池中依然存在"hello"
         */
        String s2 = "hello";
        //字符串连接，会创建新的字符串对象
        s2 = s2 + s1;
        /**
         * 使用加号+进行字符串连接时
         * 1）根据当前s2字符串对象创建一个StringBuillder对象，假设叫sb
         * 2）调用了sb对象的append（）方法把s1连接起来
         * 3）调用了sb对象的toString（）方法，在该方法中创建了一个新的String对象返回
         */

        ///以下两行共创建了多少个String对象？   2个：一个"abc "常量，一个new出来的
        String s3 = "abc";
        String s4 = new String("abc");

        ///以下两行共创建了多少个String对象？   2个：一个"abc "常量，一个new出来的
        String s5 = "haha";
        String s6 = new String("ha" + "ha" + "ha");
    }
}
