package bjpowernode.chapter06.file;

import java.io.File;

/**
 * 查看文件的属性
 *
 * @author Huxzhi
 * @date 2019/11/28
 */
public class Test02 {
    public static void main(String[] args) {
        //File f1 = new File("d:/hehe.avi");
        File f1 = new File("hehe.avi");
        System.out.println(f1.getAbsolutePath());//返回绝对路径（从根目录开始的路径）
        System.out.println(f1.getPath());//返回路径
        System.out.println(f1.getParent());//返回上一级文件夹
        System.out.println(f1.getName());//对象名
        System.out.println(f1.length());//文件大小
        System.out.println(f1.exists());//是否存在
        System.out.println(f1.isFile());//是否为文件
        System.out.println(f1.isAbsolute());//是否绝对路径
        System.out.println(f1.lastModified());//最后一次修改的时间
    }
}
