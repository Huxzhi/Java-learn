package bjpowernode.chapter07_Thread.demo01;

//1)定义继承Thread
public class SubThread extends Thread {
    //2)重写run()方法，run()方法体中的代码就是子线程要执行的代码

    @Override
    public void run() {
        for (int i = 1; i < 101; i++) {
            System.out.println("sub thread : " + i);
        }
    }
}
