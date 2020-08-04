package bjpowernode.chapter07_Thread.demo04;

/**
 * 线程优先级
 * 每个线程都有一个优先级，取值范围：1~10
 * 所有线程默认的优先级为：5
 * 优先级越高，获得CPU执行权的机率越大
 * setPriority（）设置优先级
 * <p>
 * 多核处理器设置线程优先级没太多意义
 *
 * @author Huxzhi
 * @date 2019/11/30
 */
public class Test03 {
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
        t1.setPriority(1);
        //设置优先级
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "---->" + i);
                }
            }
        }, "t2");
        //通过构造方法指定线程名称
        t2.setPriority(10);
        t2.start();

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(Thread.currentThread().getPriority());
    }
}
