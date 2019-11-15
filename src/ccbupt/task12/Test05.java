package ccbupt.task12;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 5.（20分）根据学生输入的成绩，判断其成绩的等级并输出（>90优，>=80良，>=60及格，其他不及格）。
 * 要求学生输入的必须为0到100之间的正整数，要对以下异常进行处理：
 * 1.用户输入的是非整数；
 * 2.整数范围不在0到100之间。
 * 对非整数异常的处理方式为：提示用户输入的不是整数，结束程序；
 * 对整数范围不再0~100之间的异常处理方式为：提示用户输入的范围不在0到100之间。
 * 提示：输入非整数异常，抛出异常类InputMismatchException的对象 ；
 * 范围不再0~100之间的异常，可抛出Exception异常或自己定义异常类并抛出。
 * 说明：当使用scanner类的nextInt()读取整数时，如果输入的不是正数，会抛出InputMismatchException异常。
 *
 * @author Huxzhi
 * @date 2019/11/15
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("请输入您的分数:");
            int i = input.nextInt();
            if (i < 0 || i > 100) {
                throw new Exception("分数必须在0—100之间");
            }
            if (i > 90) {
                System.out.println("优");
            } else if (i >= 80) {
                System.out.println("良");
            } else if (i >= 60) {
                System.out.println("及格");
            } else {
                System.out.println("不及格");
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            return;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return;
        }
    }
}
