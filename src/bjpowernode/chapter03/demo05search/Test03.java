package bjpowernode.chapter03.demo05search;

import java.util.Arrays;

/**
 * 选择排序
 * 从小到大排列
 */
public class Test03 {
    public static void main(String[] args) {
        int[] data = new int[10];
        for (int i = 0; i < 10; i++)
            data[i] = (int) (Math.random() * 99) + 1;
        System.out.println(Arrays.toString(data));
        System.out.println("-------------------------");

        for (int i = 0; i < data.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[min])
                    min = j;
            }
            if (min != i) {
                int temp = data[min];
                data[min] = data[i];
                data[i] = temp;
            }
        }
        System.out.println(Arrays.toString(data));
    }
}


