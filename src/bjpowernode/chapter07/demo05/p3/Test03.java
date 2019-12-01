package bjpowernode.chapter07.demo05.p3;

/**
 * 同步实例方法
 * 直接使用synchronized修饰实例方法，把整个方法体作为同步代码块，默认的锁对象是this对象
 *
 * @author Huxzhi
 * @date 2019/11/30
 */
public class Test03 {
    public static void main(String[] args) {

        Test03 obj = new Test03();
        //创建两个线程，分别调用m1（）方法与m2（）方法
        new Thread(new Runnable() {
            @Override
            public void run() {
                obj.m1();

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                obj.m2();

            }
        }).start();
    }

    /**
     * 直接使用synchronized修饰了实例方法，把整个方法体作为同步代码块，默认的锁对象是this对象
     */
    public synchronized void m1() {
        System.out.println("m1方法开始执行");

        for (int i = 0; i < 100; i++) {
            System.out.println("m1 -->" + i);
        }

        System.out.println("m1方法结束执行");
    }

    /**
     * 当前m2（）方法，把整个方法体作为同步代码块，锁对象是this对象
     */
    public void m2() {
        synchronized (this) {
            System.out.println("m2方法开始执行");
            for (int i = 0; i < 100; i++) {
                System.out.println("m2 ====>" + i);
            }
            System.out.println("m2方法结束执行");
        }

    }
}
