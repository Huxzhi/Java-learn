package ccbupt.task03;

import java.util.Scanner;

/**
 * 随机生成二维数组（二维数组的元素值为1~100间随机数），并以矩阵的形式输出。
 *
 * @author Huxzhi
 * @date 2019/10/8
 */
public class Test02 {

    public static void main(String[] args) {
        System.out.println("请输入二维数组的行数和列数：");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print((int) (Math.random() * 99) + 1 + "\t");
            }
            System.out.println();
        }
    }

}
