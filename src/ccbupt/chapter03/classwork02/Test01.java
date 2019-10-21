package ccbupt.chapter03.classwork02;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = (int) (Math.random() * 9) + 1;
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
