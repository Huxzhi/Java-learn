package bjpowernode.chapter07.demo05.p3;

/**
 * 同步代码块
 * 经常定义一个常量对象作为锁对象
 * 有时也会使用this对象作为锁对象
 * 有时也会使用当前类的运行时类对象作为锁对象，如Test02.class，可以简单的理解为Test02类的字节码文件，有人称它为类锁
 *
 * @author Huxzhi
 * @date 2019/11/30
 */
public class Test02 {

    //常量
    private static final Object OBJ = new Object();

    public static void main(String[] args) {

        //创建两个线程，分别调用m1（）方法与m2（）方法
        new Thread(new Runnable() {
            @Override
            public void run() {
                new Test02().m1();

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                new Test02().m2();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Test02.m3();
            }
        }).start();
    }

    public void m1() {
        System.out.println("m1方法开始执行");

//      synchronized (OBJ) {    //x经常定义一个常量对象作为锁对象
        //有时也会使用this对象作为锁对象
//        synchronized (this) {
        synchronized (Test02.class) {
            for (int i = 0; i < 100; i++) {
                System.out.println("m1 -->" + i);
            }
        }
        System.out.println("m1方法结束执行");
    }

    public void m2() {
        System.out.println("m2方法开始执行");
//        synchronized (OBJ) {
//        synchronized (this) {
        synchronized (Test02.class) {
            for (int i = 0; i < 100; i++) {
                System.out.println("m2 ====>" + i);
            }
        }
        System.out.println("m2方法结束执行");
    }

    public static void m3() {
        System.out.println("m3方法开始执行");
        synchronized (Test02.class) {
            for (int i = 0; i < 100; i++) {
                System.out.println("m3 ****" + i);
            }
        }
        System.out.println("m3方法结束执行");
    }
}

