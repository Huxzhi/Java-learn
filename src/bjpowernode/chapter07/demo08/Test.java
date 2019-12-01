package bjpowernode.chapter07.demo08;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer
 * 定时器
 *
 * @author Huxzhi
 * @date 2019/12/1
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main....begin....");

        //创建定时器对象
        //Timer timer = new Timer();
        //把定时器设置守护线程
        Timer timer = new Timer(true);

        //timer.schedule(task，time);        //在指定的时间time，执行任务task
        //timer.schedule(task，delay);       //延迟delay毫秒后，执行task任务
        //timer.scheduleAtFixedRate(task，firstTime，period);//指定task任务第一次执行的时间，以后每隔period毫秒再执行一次

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(new Date());
            }
        }, 3000, 1000);

        //main线程睡眠10秒
        Thread.sleep(10000);
        System.out.println("main....end....");
    }
}
