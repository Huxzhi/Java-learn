package bjpowernode.chapter06.file;

import java.io.File;

/**
 * 列出文件夹的内容
 *
 * @author Huxzhi
 * @date 2019/11/28
 */
public class Test03 {
    public static void main(String[] args) {
        //listSub1("D:\\");
        //listSub2("D:\\");
        listSub3("D:\\");
    }

    /**
     * 显示指定文件夹的内容
     *
     * @param dirname 文件路径
     */
    private static void listSub1(String dirname) {
        File dir = new File(dirname);

        String[] subs = dir.list();
        for (String string : subs
        ) {
            System.out.println(string);

        }
    }

    /**
     * 显示绝对路径
     *
     * @param dirname
     */
    private static void listSub2(String dirname) {
        File dir = new File(dirname);

        File[] listFiles = dir.listFiles();
        for (File file : listFiles
        ) {
            System.out.println(file.getAbsolutePath());

        }
    }

    /**
     * 显示绝对路径，包括子文件的内容
     *
     * @param dirname 文件路径
     */
    private static void listSub3(String dirname) {
        File dir = new File(dirname);

        File[] listFiles = dir.listFiles();
        for (File file : listFiles
        ) {
            System.out.println(file.getAbsolutePath());
            //如果file对象是文件夹，显示该子文件夹得内容
            if (file.isDirectory()) {
                //递归调用
                listSub3(file.getAbsolutePath());
            }
        }
    }
}
