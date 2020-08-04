package bjpowernode.chapter07_Thread.demo05.p3;

/**
 * 同步代码块
 * 同步任码块想要实现同步必须使用同一个锁对象
 * 只要使用了同一个锁对象的同步代码块就可以同步
 *
 * @author Huxzhi
 * @date 2019/11/30
 */
public class Test01 {

    //常量
    private static final Object OBJ = new Object();

    public static void main(String[] args) {
        Test01 obj = new Test01();

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
                //obj.m2();         //可以同步
                new Test01().m2();  //不可以同步，不是同一个锁对象
            }
        }).start();
    }

    public void m1() {
        System.out.println("m1方法开始执行");

//      synchronized (OBJ) {    //x经常定义一个常量对象作为锁对象
        //有时也会使用this对象作为锁对象
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                System.out.println("m1 -->" + i);
            }
        }
        System.out.println("m1方法结束执行");
    }

    public void m2() {
        System.out.println("m2方法开始执行");
//        synchronized (OBJ) {
        synchronized (this) {

            for (int i = 0; i < 100; i++) {
                System.out.println("m2 ====>" + i);
            }
        }
        System.out.println("m2方法结束执行");
    }
}

