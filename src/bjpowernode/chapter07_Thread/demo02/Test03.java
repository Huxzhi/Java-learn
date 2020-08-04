package bjpowernode.chapter07_Thread.demo02;

/**
 * 当接口的实现类只使用一次时，或者抽象类的子类只使用一次时，就不需要单独的再定义一个类，可以直接使用匿名内部类
 *
 * @author Huxzhi
 * @date 2019/11/29
 */
public class Test03 {
    public static void main(String[] args) {
        //在调用方法时，实参是接口匿名内部类对象
        Thread t22 = new Thread(new Runnable() {
            //在匿名内部类中重写接口抽象方法
            @Override
            public void run() {
                //在子线程，打印100行字符串
                for (int i = 1; i <= 100; i++) {
                    System.out.println("sub thread : " + i);
                }
            }
        });
        t22.start();

        //main
        for (int i = 1; i < 101; i++) {
            System.out.println("main-->" + i);
        }
    }
}
