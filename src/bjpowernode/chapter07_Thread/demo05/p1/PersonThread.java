package bjpowernode.chapter07_Thread.demo05.p1;

/**
 * 创建线程类，模拟人从帐户中取钱
 *
 * @author Huxzhi
 * @date 2019/11/30
 */
public class PersonThread extends Thread {
    //银行账户
    private BankAccount account;

    public PersonThread(BankAccount account) {
        super();
        this.account = account;
    }

    @Override
    public void run() {
        account.withdraw();
    }
}
