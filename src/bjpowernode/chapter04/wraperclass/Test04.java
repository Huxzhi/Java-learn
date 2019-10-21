package bjpowernode.chapter04.wraperclass;

/**
 * 装箱：
 * 把基本类型转换为包装类对象
 * 拆箱：
 * 把包装类对象转换为基本类型
 * 在Java中，可以自动的进行装箱与拆箱
 *
 * @author Huxzhi
 * @date 2019/10/5
 */

public class Test04 {
    public static void main(String[] args) {
        Integer i1 = 147;
        int num = i1;

        Integer i2 = 666;
        Integer i3 = 666;
        //true
        System.out.println(i2.equals(i3));
        //false
        System.out.println(i2 == i3);

        Integer i4 = 77;
        Integer i5 = 77;
        System.out.println(i4 == i5);
        /**
         * Java认为-128~127之间的整数使用最频繁，所以这个范围内整数创建的包装类对象采用享元模式，即把包装类对象存储到共享池中
         * 在执行i4=77时，系统根据77创建一个Integer对象，把该对象存储到共享池中
         * 当执行i5=77时，系统直接把共享池中的Integer对象的引用赋值给i5
         */
    }
}
