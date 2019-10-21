package bjpowernode.chapter03.demo05search;

import java.util.Arrays;

/**
 * 冒泡排序(由小到大)
 * 从前往后两两比较
 */
public class Test01 {
    public static void main(String[] args) {
        int i, j;
        int[] data = {21, 84, 986, 4, 65, 34, 48, 15, 96, 234};
        System.out.println(Arrays.toString(data));
        System.out.println("-----------------------");
        for (i = 0; i < data.length - 1; i++) {
            //第一轮
            for (j = 0; j < data.length - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    int t = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = t;
                }
                System.out.println(Arrays.toString(data));
            }
            System.out.println("-----------------------");
        }
    }
}
