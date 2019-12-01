package bjpowernode.chapter07.demo04;

/**
 * 线程终止
 *
 * @author Huxzhi
 * @date 2019/11/30
 */
public class Test08 {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 300; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + i);
                }
            }
        }, "t1");
        t1.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
        //当main线程结束，把t1线程终止
        t1.stop();//方法过时，不建议再使用
    }
}
