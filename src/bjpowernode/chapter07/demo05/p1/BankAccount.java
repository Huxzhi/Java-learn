package bjpowernode.chapter07.demo05.p1;

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

    /**
     * 取钱操作，约定每次取钱1000万
     */
    public void withdraw() {
        System.out.println(Thread.currentThread().getName() + "取钱前，查询余额:" + balance + "万元");
        balance -= 1000;
        System.out.println(Thread.currentThread().getName() + "取了1000万后余额:" + balance + "万元");
    }
}
