package bjpowernode.chapter07.demo02;

/**
 * 创建线程的方式二
 * 实现Runnable接口
 *
 * @author Huxzhi
 * @date 2019/11/29
 */
public class Test02 {
    public static void main(String[] args) {
        //3)创建线程对象
        Prime p = new Prime();
        //Thread(Runnable)构造方法的形参是接口，在调用方法是传递接口的实现类对象
        Thread t2 = new Thread(p);

        //4)开启线程
        t2.start();

        //main
        for (int i = 1; i < 101; i++) {
            System.out.println("main-->" + i);
        }
    }
}
