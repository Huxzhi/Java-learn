package bjpowernode.chapter07.demo06;

import java.util.Random;

/**
 * 生产者线程类
 *
 * @author Huxzhi
 * @date 2019/12/1
 */
public class ProducerThread extends Thread {
    private MyStorage storage;

    public ProducerThread(MyStorage storage) {
        super();
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 30; i++) {
            String product = "产品编号:" + new Random().nextInt(100);
            storage.store(product);
        }
    }
}
