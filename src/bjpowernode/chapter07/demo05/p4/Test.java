package bjpowernode.chapter07.demo05.p4;

/**
 * 演示死锁
 * 当多个线程同步时，得锁的顺序不一致，导致线程相互等待的情况，称为死锁现象如何避免死锁？
 * 保证锁的顺序都一致
 *
 * @author Huxzhi
 * @date 2019/11/30
 */
public class Test {
    public static void main(String[] args) {
        SubThread t1 = new SubThread();
        t1.setName("a");
        t1.start();

        SubThread t2 = new SubThread();
        t1.setName("b");
        t2.start();
    }
}
