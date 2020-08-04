package bjpowernode.chapter07_Thread.demo05.p2;

/**
 * 银行账户类
 *
 * @author Huxzhi
 * @date 2019/11/30
 */
public class BankAccount {

    /**
     * 账户余额（万元）
     */
    private int balance = 100000;

    private static final Object OBJ = new Object();

    /**
     * 取钱操作，约定每次取钱1000万
     */
    public void withdraw() {
        synchronized (OBJ) {
            System.out.println(Thread.currentThread().getName() + "取钱前，查询余额:" + balance + "万元");
            balance -= 1000;
            System.out.println(Thread.currentThread().getName() + "取了1000万后余额:" + balance + "万元");
        }
    }
    /*
        1）bingbing先获得CPU执行权，执行withdraw（）方法，获得0B]这个锁对象，执行取钱操作
        2）在bingbing执行取钱操作期间，CPU被xiaoming抢走了，bingbing转为就绪状态
        3）xiaoming获得CPU执行权，执行withdraw（）方法，在执行取钱操作前，先获得0B]锁对象，
            现在OBJ锁对象被bingbing持有，xiaoming就转到等待锁对象池中进行阻塞
        4）yanxiaojie获得CPU执行权，执行withdraw（）方法，在执行取钱操作前，先获得0B]锁对象，
            现在0B]锁对象被bingbing持有，yanxiaojie就转到等待锁对象池中进行阻塞
        5）bingbing重新获得CPU执行权，执行完取钱操作，释放锁对象
        6）等待锁对象池中的xiaoming或者yanxiaojie中的一个获得锁对象，转为就绪状态，另一个继续阻塞
     */

}
