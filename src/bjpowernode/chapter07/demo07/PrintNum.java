package bjpowernode.chapter07.demo07;

public class PrintNum {
    private int num = 0;

    //打印奇数
    public synchronized void printOdd() {
        //当num是偶数时，需要等待
        while (num % 2 == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " : " + num);
        num++;
        //通知打印偶数
        this.notify();
    }

    //打印偶数
    public synchronized void printEven() {

        //当num是偶数时，需要等待
        while (num % 2 == 1) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " : " + num);
        num++;
        //通知打印奇数
        this.notify();
    }
}
