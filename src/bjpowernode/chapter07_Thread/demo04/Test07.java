package bjpowernode.chapter07_Thread.demo04;

/**
 * 线程加入（合并）
 * t1.join（）
 *
 * @author Huxzhi
 * @date 2019/11/30
 */
public class Test07 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + i);
                }
            }
        }, "t1");
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "---->" + i);
                    //当i==30时，加入t1线程，当前线程转为等待状态，等到t1线程执行完毕后，当前线程再转为就绪状态
                    if (i == 30) {
                        try {
                            t1.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        //通过构造方法指定线程名称
        t2.start();
    }
}
