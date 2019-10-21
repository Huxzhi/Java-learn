package bjpowernode.chapter04.string;

/**
 * 字符串的比较
 *
 * @author Huxzhi
 * @date 2019/10/2
 */
public class Test04 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        //true
        System.out.println(s1 == s2);
        /**
         * 关系运算符==判断的是两个变量的值是否相等，
         * 当前运行结果为true，表示s1变量和s2变量的值是相等的，说明s1和s2两个变量引用了同一个对象
         * 在Java中，所有双引号引起来的字符串字面量都存储在字符串常量池中
         * 当执行第一行s1="hel1o"时，系统就把”hel1o“字面量只在到常量池中，把它的引用赋值给s1
         * 当执行第二行s2="hel1o"时，系统直接把常量池中的“he11o"字面量的引用赋值给s2
         */
        //true
        System.out.println(s1.equals(s2));
        String s3 = "he" + "llo";
        //true
        System.out.println(s1 == s3);
        /**
         *字符串字面量进行连接时，javac编译器会进行优化，
         *在编译阶段，把”he"+"11o"优化为“hello"
         */

        String s4 = "hehe123";
        String s5 = "hehe" + 123;
        //true
        System.out.println(s4 == s5);
        /**
         * 字符串字面量与整数字面量进行连接时，javac编译器也会进行优化
         */

        int num = 123;
        String s6 = "hehe" + num;
        //false
        System.out.println(s4 == s6);
        /**
         * 变量不优化
         */
    }
}
