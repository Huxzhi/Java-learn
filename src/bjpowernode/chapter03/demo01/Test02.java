package bjpowernode.chapter03.demo01;

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {
        int[] data = {66, 8, 9, 45, 955, 62, 26, 4, 854, 89};
        //排序
        Arrays.sort(data);
        //打印
        System.out.println(Arrays.toString(data));
        //改变数组长度
        Arrays.copyOf(data, data.length * 2);
        System.out.println(Arrays.toString(data));
        //填充
        Arrays.fill(data, 6, 10, 456);
        //二分查找，前提是数组由小到大排序
        System.out.println(Arrays.binarySearch(data, 12));
    }
}
