package bjpowernode.chapter07_Thread.demo07;

/**
 * 创建两个线程，一个线程打印奇数，一个线程打印偶数，实现交替打印
 * 线程1：1
 * 线程2：2
 * 线程1：3
 * 线程2：4
 * 线程1：5
 * 线程2：6
 *
 * @author Huxzhi
 * @date 2019/12/1
 */
public class Test {
    public static void main(String[] args) {
        PrintNum printNum = new PrintNum();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    printNum.printOdd();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    printNum.printEven();
                }
            }
        }).start();
    }
}
