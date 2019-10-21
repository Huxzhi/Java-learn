package ccbupt.task03;

import java.util.Scanner;

/**
 * 用户输入n个数，计算n个数均值，输出这n个数中大于均值的那些数。
 *
 * @author Huxzhi
 * @date 2019/10/8
 */
public class Test04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("您要输入多少个数：");
        int a = input.nextInt();
        double[] b = new double[a];
        double sum = 0;
        for (int i = 0; i < a; i++) {
            b[i] = input.nextDouble();
            sum += b[i];
        }
        sum = sum / a;
        for (int i = 0; i < a; i++) {
            if (b[i] > sum) {
                System.out.println(b[i]);
            }
        }
    }

}
