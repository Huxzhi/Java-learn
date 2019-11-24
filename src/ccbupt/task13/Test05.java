package ccbupt.task13;

/**
 * 3个售票亭(Booth)共同售卖100张票(Reservoir)。每个售票亭要先判断是否有余票，然后再卖出一张票。
 * 当每个售票亭卖出一张票，要有提示语句输出到控制台上。直到100张票卖完为止
 * <p>
 * 在Java中，我们将共享的资源置于一个对象中，比如下面r(Reservoir)对象。
 * 它包含了总共的票数；将可能造成竞争条件的，针对共享资源的操作，放在synchronized(同步)方法中，
 * 比如下面的sellTicket()。synchronized是方法的修饰符。在Java中，同一对象的synchronized方法只能同时被一个线程调用。
 * 其他线程必须等待该线程调用结束，(余下的线程之一)才能运行。这样，我们就排除了竞争条件的可能。
 * <p>
 * 在main()方法中，我们将共享的资源(r对象)传递给多个线程:
 *
 * @author Huxzhi
 * @date 2019/11/24
 */
public class Test05 {
    public static void main(String[] args) {
        Reservoir r = new Reservoir(100);
        Booth b1 = new Booth(r);
        Booth b2 = new Booth(r);
        Booth b3 = new Booth(r);
    }
}

/**
 * contain shared resource
 */
class Reservoir {
    private int total;

    public Reservoir(int t) {
        this.total = t;
    }

    /**
     * Thread safe method
     * serialized access to Booth.total
     */
    public synchronized boolean sellTicket() {
        if (this.total > 0) {
            this.total = this.total - 1;
            return true; // successfully sell one
        } else {
            return false; // no more tickets
        }
    }
}

/**
 * create new thread by inheriting Thread
 */
class Booth extends Thread {
    private static int threadID = 0; // owned by Class object

    private Reservoir release;      // sell this reservoir
    private int count = 0;          // owned by this thread object

    /**
     * constructor
     */
    public Booth(Reservoir r) {
        super("ID:" + (++threadID));
        this.release = r;          // all threads share the same reservoir
        this.start();
    }

    /**
     * convert object to string
     */
    @Override
    public String toString() {
        return super.getName();
    }

    /**
     * what does the thread do?
     */
    @Override
    public void run() {
        while (true) {
            if (this.release.sellTicket()) {
                this.count = this.count + 1;
                System.out.println(this.getName() + ": sell 1");
                try {
                    sleep((int) Math.random() * 100);   // random intervals
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                break;
            }
        }
        System.out.println(this.getName() + " I sold:" + count);
    }
}
