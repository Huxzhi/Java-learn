package bjpowernode.chapter03.demo05search;

import java.util.Arrays;

public class Test05binary {
    public static void main(String[] args) {
        int[] data = {1, 15, 59, 68, 100, 487, 489, 520};
        Arrays.sort(data);
        System.out.println(Arrays.toString(data));
        int index = binarySearch(data, 59);
        System.out.println(index);
        System.out.println(binarySearch(data,43));
        System.out.println(binarySearch(data,8));
        System.out.println(binarySearch(data,15));
    }

    private static int binarySearch(int[] data, int key) {
        int begin = 0;
        int end = data.length - 1;
        int mid = (begin + end) / 2;
        while (begin <= end) {
            if (data[mid] == key) {
                return mid;
            } else if (data[mid] < key) {
                begin = mid + 1;
                mid = (begin + end) / 2;
            } else {
                end = mid - 1;
                mid = (begin + end) / 2;
            }
        }
        return -1;
    }
}
