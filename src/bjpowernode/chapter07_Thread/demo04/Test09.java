package bjpowernode.chapter07_Thread.demo04;

/**
 * 终止线程
 * 想办法让run（）运行结束
 * 在线程中设置一个标志，定期判断这个标志是否发生变化，标志发生变化就退出run（）方法
 *
 * @author Huxzhi
 * @date 2019/11/30
 */
public class Test09 {
    public static void main(String[] args) {
        SubThread t1 = new SubThread();
        t1.start();

        Prime prime = new Prime();
        new Thread(prime).start();

        //main
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
        //main线程结束，让其他的线程也结束
        //修改子线程的标志
        t1.running = false;
        prime.stopping = true;

    }
}

/**
 * 继承类方式
 */
class SubThread extends Thread {
    //线程运行标志
    boolean running = true;

    @Override
    public void run() {
        for (int i = 0; running && i < 300; i++) {
            System.out.println(Thread.currentThread().getName() + "-------->" + i);
        }
    }
}

/**
 * 实现类方式
 */
class Prime implements Runnable {
    //结束 结束 结束
    boolean stopping = false;

    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            if (stopping) {
                return;
            }
            System.out.println(Thread.currentThread().getName() + "-------->" + i);
        }
    }
}