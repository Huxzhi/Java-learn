package bjpowernode.chapter07.demo04;

/**
 * 线程让步
 * Thread.yield();
 *
 * @author Huxzhi
 * @date 2019/11/30
 */
public class Test06 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "---->" + i);
                    if (i % 10 == 0) {
                        Thread.yield();
                        //线程让步，当前线程会释放CPU执行权，转换为就绪状态
                    }
                }
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + i);
                }
            }
        }, "t2");
        //通过构造方法指定线程名称
        t2.start();
    }
}
