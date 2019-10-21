package ccbupt.task03;

import java.util.Scanner;

/**
 * 输入两个3*3矩阵，计算这两个矩阵的和并输出。
 *
 * @author Huxzhi
 * @date 2019/10/8
 */
public class Test11 {

    public static void main(String[] args) {
        System.out.println("请输入数据的行数和列数");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int[][] a1 = new int[a][b];
        int[][] b1 = new int[a][b];
        System.out.println("请输入第一个数组");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                a1[i][j] = input.nextInt();
            }
        }
        System.out.println("请输入第二个数组");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                b1[i][j] = input.nextInt();
            }
        }
        System.out.println("数组和为");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                b1[i][j] += a1[i][j];
                System.out.print(b1[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
