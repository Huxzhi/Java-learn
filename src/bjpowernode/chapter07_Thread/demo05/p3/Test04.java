package bjpowernode.chapter07_Thread.demo05.p3;

/**
 * 同步静态方法
 * 直接使用synchronized修饰静态方法，把整个方法体作为同步代码块，默认的锁对象是当前类的运行时类对象，即Test04.class
 *
 * @author Huxzhi
 * @date 2019/11/30
 */
public class Test04 {
    public static void main(String[] args) {

        //创建两个线程，分别调用m1（）方法与m2（）方法
        new Thread(new Runnable() {
            @Override
            public void run() {
                Test04.m1();

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Test04.m2();

            }
        }).start();
    }

    /**
     * 直接使用synchronized修饰了静态方法，把整个方法体作为同步代码块，默认的锁对象是当前类的运行时类对象，即Test04.class
     */
    public synchronized static void m1() {
        System.out.println("m1方法开始执行");

        for (int i = 0; i < 100; i++) {
            System.out.println("m1 -->" + i);
        }

        System.out.println("m1方法结束执行");
    }

    /**
     * 当前m2（）方法，把整个方法体作为同步代码块，锁对象是Test04.class对象
     */
    public static void m2() {
        synchronized (Test04.class) {
            System.out.println("m2方法开始执行");
            for (int i = 0; i < 100; i++) {
                System.out.println("m2 ====>" + i);
            }
            System.out.println("m2方法结束执行");
        }

    }
}
