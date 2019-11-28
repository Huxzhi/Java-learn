package bjpowernode.chapter06.print;

import java.io.*;

/**
 * PrintStream
 * 打印字节流
 *
 * @author Huxzhi
 * @date 2019/11/28
 */
public class Test01 {
    public static void main(String[] args) throws FileNotFoundException {
        //1)
        OutputStream out = new FileOutputStream("d:/log.txt", true);
        PrintStream pStream = new PrintStream(out);

        pStream.print("hello");
        pStream.println("world");

        //2）System类的out成员就是PrintStream类型的打印流
        //System.out默认系统的标准输出设备是显示器
        System.out.println("默认在显示器上打印信息");
        //可以修改System.out的打印方向
        System.setOut(pStream);
        System.out.println("这一行信息就不是在屏幕上打印，而是打印到pStream流中，即log.txt文件");

        //3)经常把异常信息保存到日志文件中
        try {
            FileInputStream fis = new FileInputStream("h:/asdfsaf.tt");
        } catch (FileNotFoundException e) {
            //在开发时，一般调用e.printStackTrace（）把异常信息打印到屏幕上方便程序员调试
            //在部署后，会把异常信息打印到日志文件中
            e.printStackTrace(pStream);
        }
        pStream.close();
    }
}
