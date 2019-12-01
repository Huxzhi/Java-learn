package bjpowernode.chapter07.demo04;

/**
 * 线程的状态
 * t1.getState()    返回枚举类型state
 * NEW RUNNABLE BLOCKED  WAITING TIMED_WAITING TERMINATED
 *
 * @author Huxzhi
 * @date 2019/11/30
 */
public class Test02 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + i);
                }
            }
        }, "t1");
        System.out.println("11: " + t1.getState());
        //NEW

        t1.start();

        System.out.println("22: " + t1.getState());
        //RUNNABLE

        //main线程
        for (int i = 0; i < 200; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }

        System.out.println("33: " + t1.getState());
        //TERMINATED
    }
}
