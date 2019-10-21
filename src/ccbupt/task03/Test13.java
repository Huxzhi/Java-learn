package ccbupt.task03;

import java.util.Scanner;

/**
 * 读入10个数并显示其中互不相同的数。
 *
 * @author Huxzhi
 * @date 2019/10/8
 */
public class Test13 {
    public static void main(String[] args) {
        System.out.println("请输入十个整数：");
        Scanner input = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            int k = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    k = 0;
                }
            }
            if (k == 1) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
