package bjpowernode.chapter07_Thread.demo04;

/**
 * 线程休眠
 * Thread.sleep（2000）；
 * 1）静态方法，通过类名直接调用
 * 2）睡眠的单位是毫秒
 * 3）sleep（）有受检异常需要预处理
 * 4）sleep（）方法所在的线程睡眠
 *
 * @author Huxzhi
 * @date 2019/11/30
 */
public class Test04 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + i);
                    //当i=50时，睡眠5秒
                    if (i == 50) {
                        try {
                            Thread.sleep(5000);
                            //run（）定义时没有抛出异常，重写也不能抛出异常
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }, "t1");
        //通过构造方法指定线程名称
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
    }
}
