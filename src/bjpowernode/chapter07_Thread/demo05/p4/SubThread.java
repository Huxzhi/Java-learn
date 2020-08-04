package bjpowernode.chapter07_Thread.demo05.p4;

public class SubThread extends Thread {
    @Override
    public void run() {
        if ("a".equals(Thread.currentThread().getName())) {
            synchronized ("资源1") {
                System.out.println("线程a获得了资源1，还想获得资源2");
                synchronized ("资源2") {
                    System.out.println("线程a同时获得资源1与资源2，可以做爱做的事");
                }
            }
        }

        if ("b".equals(Thread.currentThread().getName())) {
            synchronized ("资源2") {
                System.out.println("线程a获得了资源2，还想获得资源1");
                synchronized ("资源1") {
                    System.out.println("线程a同时获得资源1与资源2，可以做爱做的事");
                }
            }
        }
    }
}
