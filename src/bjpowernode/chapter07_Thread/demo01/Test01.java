package bjpowernode.chapter07_Thread.demo01;

public class Test01 {
    public static void main(String[] args) {
        //3)创建线程对象
        SubThread t1 = new SubThread();
        //4)启动的新的线程，会执行run()方法
        t1.start();//启动的新的线程，会执行run()方法
        //t1.run();//就是普通的实例方法的调用，不会开启新的线程

        //当前线程是main线程
        for (int i = 1; i <= 100; i++) {
            System.out.println("main--> " + i
            );
        }
        /*
         * 当前程序有main线程和t1线程在同时执行，每次运行的结果可能不一样
         * 多线程程序中的多个线程，同时争抢CPU执行权，抢到CPU执行权后才会执行
         *
         * 在单核CPU中，某一时刻CPU只能执行一个任务，因为CPU执行速度非常快，可以快速的在各个线程之间进行切换
         * 对于用户来说，感觉是多个线程在同时执行
         *
         */
    }
}
