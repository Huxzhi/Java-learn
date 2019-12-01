package bjpowernode.chapter07.demo03;

import java.util.Random;
import java.util.concurrent.Callable;

//1)定义类实现Callable接口
//Callable接口中的cal1（）有返回值，通过Callable泛型指定返回值的类型
//Runnable接口中的run（）方法没有返回值，Callable接口的cal1（）有返回值
public class Prime3 implements Callable<Integer> {
    //2)重写抽象方法call()方法
    @Override
    public Integer call() throws Exception {
        int result = new Random().nextInt(100);
        System.out.println("执行子线程，完全某个计算，结果为：" + result);
        return result;
    }
}
