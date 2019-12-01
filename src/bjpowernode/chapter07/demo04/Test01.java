package bjpowernode.chapter07.demo04;

/**
 * 线程的基本操作
 * Thread.currentThread（）      返回当前线程
 * t1.getName（）                返回线程名称，默认Thread-e
 * t2.setName（"t2"）;           设置线程名科
 * t1.isAlive()                 判断线程是否终止，线程的run（）运行结束，该线程就终止
 * t2.setDaemon（true）；        设置线程为守护线程
 *
 * @author Huxzhi
 * @date 2019/11/29
 */
public class Test01 {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + i);
                }
            }
        }, "t1");
        //通过构造方法指定线程名称
        t1.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "---->" + i);
                }
            }
        }).start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + i);
                }
            }
        });
        t2.setName("t2");
        t2.setDaemon(true);
        //设置线程为守护程，当JVM只有守护线程时，JVM会退出
        t2.start();

        //main
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "==>" + i);

        }
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
    }
}
