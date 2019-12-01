package bjpowernode.chapter07.demo06;

/**
 * 消费者线程类
 *
 * @author Huxzhi
 * @date 2019/12/1
 */
public class ConsumerThread extends Thread {
    private MyStorage storage;

    public ConsumerThread(MyStorage storage) {
        super();
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 30; i++) {
            storage.take();
        }
    }
}
