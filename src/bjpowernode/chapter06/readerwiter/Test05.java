package bjpowernode.chapter06.readerwiter;

import java.io.*;

/**
 * 字符缓冲流
 * BufferedReader/Bufferedwriter
 * 也是一种处理流，包装流
 * <p>
 * 注意：BufferedWriter缓冲区的数据并不是立即保存到文件中，而是在符合以下条件时再保存到文件中：
 * （1）缓冲区满（2）调用flush()（3）close()
 *
 * @author Huxzhi
 * @date 2019/11/28
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        //使用BufferedReader读取文本文件内容
        //m1();
        //使用Bufferedwriter保存文本到文件
        //m2();
        //从键盘上输入文本，把这些文本保存到文件中
        m3();
    }

    private static void m3() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("d:/xyz.txt"));
        //使用BufferedReader对键盘输入流缓冲
        //System.in是标准的输入设备，即键盘
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        while (line.length() > 0) {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }
        br.close();
        bw.close();
    }

    private static void m2() throws IOException {
        Writer out = new FileWriter("d:/abc.txt", true);
        BufferedWriter bw = new BufferedWriter(out);

        bw.write("我送你99朵玫瑰花儿");

        //清空缓冲区，把数据保存到文件中
        //bw.flush();
        bw.close();
    }

    private static void m1() throws IOException {
        Reader in = new FileReader("d:/test08.java");
        BufferedReader br = new BufferedReader(in);

        //从缓冲字符流中读取一行，读到文件末尾返回nul1
        String line = br.readLine();
        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
        //包装流关闭后，被包装的流也会关闭
    }
}
