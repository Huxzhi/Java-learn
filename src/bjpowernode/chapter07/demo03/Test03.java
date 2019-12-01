package bjpowernode.chapter07.demo03;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建线程的方式三
 * 实现Callable接口
 *
 * @author Huxzhi
 * @date 2019/11/29
 */
public class Test03 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //3)创建线程对象
        //创建Callable接口实现类对象
        Prime3 prime3 = new Prime3();
        FutureTask<Integer> task = new FutureTask<>(prime3);
        //FutureTask实现了RunnableFuture<V>接口，该接口继承了Runnable接口，FutureTask类就是Runnable接口实现类

        Thread t3 = new Thread(task);

        //4)开启新的线程
        t3.start();

        //
        System.out.println("当前线程是main线程，可以获得子线程的执行结果：");
        System.out.println("result=" + task.get());

    }
}
