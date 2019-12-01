package bjpowernode.chapter07.demo06;

public class Test {
    public static void main(String[] args) {
        //先创建仓库
        MyStorage storage = new MyStorage();

        //创建三个生产者线程模拟三个人
        ProducerThread p1 = new ProducerThread(storage);
        ProducerThread p2 = new ProducerThread(storage);
        ProducerThread p3 = new ProducerThread(storage);
        p1.setName("lisisi");
        p2.setName("wangwu");
        p3.setName("chenqi");
        p1.start();
        p2.start();
        p3.start();

        //创建三个消费者
        ConsumerThread c1 = new ConsumerThread(storage);
        ConsumerThread c2 = new ConsumerThread(storage);
        ConsumerThread c3 = new ConsumerThread(storage);
        c1.setName("吃货1号");
        c2.setName("吃货2号");
        c3.setName("吃货3号");
        c1.start();
        c2.start();
        c3.start();

    }
}
