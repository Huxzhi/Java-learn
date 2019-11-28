package bjpowernode.chapter06.readerwiter;

import java.io.*;

/**
 * FileReader/Filedriter只能读写与当前环境编码兼容的文本文件
 * 如果文本文件与当前环境编码不兼容，使用InputStreamReader/OutputStreamwriter转换流读写
 * 转换流采用了适配器设计模式
 *
 * @author Huxzhi
 * @date 2019/11/28
 */
public class Test04 {
    public static void main(String[] args) throws IOException {
        //使用InputStreamReader读取文件内容
        //m1();
        //使用OutputStreamWriter保存数据
        m2();
    }

    /**
     * 当操作的文件编码与当前环境编码不兼容，使用OutputStreamwriter把字符以指定的编码转换为字节
     */
    private static void m2() throws IOException {
        //把字符保存到d:/def.txt文件，该文件是GBK编码，当前环境是UTF8编码，把字符转换为GBK格式再保存
        OutputStream out = new FileOutputStream("d:/def.txt", true);
        OutputStreamWriter osw = new OutputStreamWriter(out, "GBK");

        osw.write("\r\n");
        osw.write("当前的内容是使用转换流保存到文件中的，工作区编码是UTF8，该文件使用GBK编码");

        osw.close();
    }

    /**
     * 当文本文件的编码与当前环境编码不兼容时，使用InputStreamReader类读取
     */
    private static void m1() throws IOException {
        //读取d:/def.txt文件，该文件使用GBK编码，当前环境使用UTF8编码
        //在当前程序与指定的文件之间建立字节流通道
        InputStream in = new FileInputStream("d:/def.txt");
        //使用GBK编码，把in节流中的数据转换为字符流
        InputStreamReader isr = new InputStreamReader(in, "GBK");

        int cc = isr.read();
        while (cc != -1) {
            System.out.print((char) cc);
            cc = isr.read();
        }
        isr.close();
    }
}
