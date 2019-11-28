package bjpowernode.chapter06.fileinputoutstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件的复制
 *
 * @author Huxzhi
 * @date 2019/11/27
 */
public class Test08 {
    public static void main(String[] args) {
        //String src = "D:/IntelliJ IDEA/java-learn/src/bjpowernode/chapter06/Test08.java";
        //String deString = "d:/test08.java";
        //copyFile(src, deString);
        String src = "E:\\Java\\257_动力节点_Java基础301集_HashMap工作原理.avi";
        String deString = "d:/HashMap.avi";
        copyFiles(src, deString);
    }

    /**
     * 一次复制一个字节数组，异常处理，自动关闭流
     *
     * @param srcFilename  被复制的文件地址
     * @param destFilename 粘贴的文件地址
     */
    public static void copyFiles(String srcFilename, String destFilename) {
        try (
                FileInputStream fis = new FileInputStream(srcFilename);
                FileOutputStream fos = new FileOutputStream(destFilename);
        ) {
            byte[] bytys = new byte[1024];
            //字节数组一般是1024的偶数倍
            int len = fis.read(bytys);
            while (len != -1) {
                fos.write(bytys, 0, len);
                len = fis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 一次复制一个字节，异常处理，手动关闭流
     */
    public static void copyFile(String srcFilename, String destFilename) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(srcFilename);
            fos = new FileOutputStream(destFilename);
            int cc = fis.read();

            while (cc != -1) {
                fos.write(cc);
                //把读到的字节cc保存到输出流中
                cc = fis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
