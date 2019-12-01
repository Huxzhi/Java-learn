package bjpowernode.chapter07.demo04;

/**
 * 线程中断
 * t1.interrupt（）
 * 一般情况下，是把处于睡眠/等待中的线程给中断
 *
 * @author Huxzhi
 * @date 2019/11/30
 */
public class Test05 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + i);
                    if (i == 20) {
                        try {
                            Thread.sleep(10000);
                            //如果当前线程的睡眠被中断会产生异常
                        } catch (InterruptedException e) {
                            // e.printStackTrace();
                        }
                    }
                }
            }
        });
        t1.start();

        //main
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }

        //当main线程循环结束，把t1线程唤醒
        t1.interrupt();
    }
}
