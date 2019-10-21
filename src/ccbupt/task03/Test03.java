package ccbupt.task03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 读取10个整数，反序输出。
 *
 * @author Huxzhi
 * @date 2019/10/8
 */
public class Test03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("请输入数组元素");
        for (int i = 9; i >= 0; i--) {
            a[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(a));

    }

}
