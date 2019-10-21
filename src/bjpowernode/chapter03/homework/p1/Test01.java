package bjpowernode.chapter03.homework.p1;

import java.util.Arrays;

/**
 * 定义一个方法, 返回一个长度为10的整数数组, 对数组的元素进行随机的
 * 初始化100内的正整数, 要求数组中的元素不重复
 */
public class Test01 {
    static final int max_int = 10;

    //最大范围（100）可以修改成10
    public static void main(String[] args) {
        int[] data = getArray();
        System.out.println(Arrays.toString(data));
    }

    public static int[] getArray() {
        int[] data = new int[10];
        for (int i = 0; i < data.length; i++) {
            int xx = (int) (Math.random() * max_int + 1);
            //要求不重复
            while (exist(data, xx)) {
                xx = (int) (Math.random() * max_int + 1);
            }
            data[i] = xx;
        }
        return data;
    }

    //判断数组内是否重复
    public static boolean exist(int[] myarray, int key) {
        for (int i = 0; i < myarray.length; i++) {
            if (key == myarray[i]) return true;
        }
        return false;
    }
}
