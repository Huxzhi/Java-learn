package bjpowernode.chapter07.demo05.p1;

/**
 * 使用线程模拟多人同时从某个帐户中取钱
 * <p>
 * 当一个线程在操作期间，不允许其他的线程加入
 * 某一段代码在某一时刻只能由一个线程执行。
 * <p>
 * 工作原理
 * 任意对象都可以作为锁对象，每个对象有一个内置锁
 * 某一时刻，锁对象最多只能被一个线程持有
 * 如果线程获得了锁对象后，会一直持有，直到执行完同步代码块后才释放
 * 线程要执行同步代码块，必须先获得锁对象
 *
 * @author Huxzhi
 * @date 2019/11/30
 */
public class Test01 {
    public static void main(String[] args) {
        //先开户
        BankAccount account = new BankAccount();

        //创建三个线程，模拟三个人取钱
        PersonThread bingbing = new PersonThread(account);
        PersonThread xiaoming = new PersonThread(account);
        PersonThread xiaogang = new PersonThread(account);

        bingbing.setName("bingbing");
        xiaogang.setName("xiaogang");
        xiaoming.setName("xiaoming");

        bingbing.start();
        xiaogang.start();
        xiaoming.start();
        /*
        运行当前程序，可能会出现数据不一致的情况，这就是线程安全问题
         */
    }
}
