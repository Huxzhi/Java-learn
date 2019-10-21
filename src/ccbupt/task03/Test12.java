package ccbupt.task03;

import java.util.Scanner;

/**
 * 编程实现，读取用户输入的n个1~100之间的整数，然后计算每个数出现的次数。
 *
 * @author Huxzhi
 * @date 2019/10/8
 */
public class Test12 {
    public static void main(String[] args) {
        System.out.println("请输入数字个数：");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int[] b = new int[a];
        int[] b1 = new int[a];
        for (int k = 0; k < a; k++) {
            b1[k] = 0;
        }
        int b2 = 1;
        System.out.println("请输入1~100间的整数");
        for (int i = 0; i < a; i++) {
            b[i] = input.nextInt();
        }
        for (int i = 0; i < a; i++) {
            if (b1[i] == 1) {
                continue;
            }
            for (int j = i + 1; j < a; j++) {
                if (b[i] == b[j]) {
                    b1[j] = 1;
                    b2 += b1[j];
                }
            }
            System.out.println(b[i] + "出现" + b2 + "次");
            b2 = 1;
        }
    }
}
