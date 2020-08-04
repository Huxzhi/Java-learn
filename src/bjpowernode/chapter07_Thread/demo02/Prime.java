package bjpowernode.chapter07_Thread.demo02;

//1)定义Runnable
public class Prime implements Runnable {
    //2）重写run（）方法，run方法体就是用户线程执行的代码
    @Override
    public void run() {
        //在子线程，打印100行字符串
        for (int i = 1; i < 101; i++) {
            System.out.println("sub thread : " + i);

        }
    }
}
