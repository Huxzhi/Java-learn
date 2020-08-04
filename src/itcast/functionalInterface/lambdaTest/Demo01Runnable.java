package itcast.functionalInterface.lambdaTest;
/**
 * 例如java.Lang.RunnabLe接口就是一个函数式接口，
 * 假设有一个startThread方法使用该接口作为参数，那么就可以使用Lambda进行传参。
 * 这种情况其实和Thread类的构造方法参数为RunnabLe没有本质区别。
 *
 * @author Huxzhi
 * @date 2020/8/4
 */

public class Demo01Runnable {
    public static void startThread(Runnable run){
        //开启多线程
        new Thread(run).start();
    }

    public static void main(String[] args) {
        //调用startThread方法，方法的参数是一个接口，那么我们可以传递这个接口的匿名内部类
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"-->"+"线程启动了");
            }
        });
        //调用start Thread方法，方法的参数是一个函数式接口，所以可以传递Lambda表达式
        startThread(()->System.out.println(Thread.currentThread().getName()+"-->"+"线程启动了"));
    }
}
