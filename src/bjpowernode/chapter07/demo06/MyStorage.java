package bjpowernode.chapter07.demo06;

import java.util.LinkedList;

/**
 * 定义仓库类
 *
 * @author Huxzhi
 * @date 2019/11/30
 */
public class MyStorage {
    LinkedList<Object> list = new LinkedList<>();
    public static final int MAX_CAPACITY = 100;

    /**
     * 向仓库中存储产品
     */
    public synchronized void store(String product) {
        //如果仓库已满，生产者等待
        while (list.size() > MAX_CAPACITY) {
            try {
                ///wait（）/notify（）这两个需要在同步代码块中，通过锁对象调用
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + " +++++存储了:" + product);
        //把产品存储到后面
        list.offer(product);
        //通知消费者消费
        this.notifyAll();
    }

    /**
     * 从仓库中取产品
     */
    public synchronized void take() {
        //判断仓库是否已空，当仓库为空时，需要等待
        while (list.size() <= 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //把前面的产品取出来
        Object product = list.poll();
        System.out.println(Thread.currentThread().getName() + " -----消费了:" + product);

        //通知生产者继续生产
        this.notifyAll();
    }
}
