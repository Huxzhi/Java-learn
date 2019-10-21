package bjpowernode.chapter04.string;

/**
 * StringBuilder/StringBuffer
 * 1)可变的字符串，频繁的进行字符串连接
 * 2)最常用的方法：append()
 * 3)StringBuffer是线程安全的，StringBuilder不是线程安全的
 * 4)StringBuilder/StringBuffer默认初始化容量：16
 * 5)默认扩容：newCapacity=value.length*2+2
 *
 * @author Huxzhi
 * @date 2019/10/2
 */
public class Test06 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hehe");
        sb.append("haha");
        sb.append("heihei");
        sb.append("yingying");
        //会调用sb.toString
        System.out.println(sb);
    }
}
