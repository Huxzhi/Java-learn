package ccbupt.task03;

import java.util.Scanner;

/**
 * 在一次测试中，5个学生每人答8道选择题（选择题选项为1，2，3，4）。
 * 编写程序实现，根据教师输入的学生答案和标准答案，输出每个学生对几道题。
 * <p>
 * 请输入第1个学生的答案：
 * 3 2 1 2 3 2 1 2
 * 请输入第2个学生的答案：
 * 2 2 2 2 2 2 2 2
 * 请输入第3个学生的答案：
 * 2 3 1 4 3 2 1 3
 * 请输入第4个学生的答案：
 * 2 3 1 2 3 4 2 1
 * 请输入第5个学生的答案：
 * 4 3 2 1 2 3 2 2
 * 请输入标准答案：
 * 3 2 1 2 3 2 1 1
 *
 * @author Huxzhi
 * @date 2019/10/8
 */
public class Test22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] a = new int[6][8];
        for (int i = 0; i < a.length - 1; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的答案：");
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("请输入标准答案：");
        for (int j = 0; j < a[a.length - 1].length; j++) {
            a[a.length - 1][j] = input.nextInt();
        }
        for (int i = 0; i < a.length - 1; i++) {
            System.out.println("第" + (i + 1) + "学生对的题数为：" + compare(a[i], a[a.length - 1]));
        }
    }

    static int compare(int[] a1, int[] a2) {
        if (a1.length != a2.length) {
            return -1;
        }
        int k = 0;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] == a2[i]) {
                k++;
            }
        }
        return k;
    }
}
