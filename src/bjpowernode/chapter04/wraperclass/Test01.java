package bjpowernode.chapter04.wraperclass;

/**
 * 为什么提供包装类？？为了编程方便
 *
 * @author Huxzhi
 * @date 2019/10/2
 */
public class Test01 {
    public static void main(String[] args) {
        m1(true);
        m1(3.14);
        m1(456);

    }

    private static void m1(Object b) {
        System.out.println(b);
    }
}
