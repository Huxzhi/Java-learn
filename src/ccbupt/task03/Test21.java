package ccbupt.task03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 用户输入n个学生的姓名和成绩，将学生和成绩按降序输出.
 *
 * @author Huxzhi
 * @date 2019/10/8
 */
public class Test21 {
    public static void main(String[] args) {
        System.out.println("请输入学生个数：");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        Student[] stu = new Student[a];
        System.out.println("请输入学生姓名和学生成绩：");
        for (int i = 0; i < stu.length; i++) {
            stu[i] = new Student(input.next(), input.nextInt());
        }
        Arrays.sort(stu, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getGrade() - o1.getGrade();
            }
        });
        System.out.println(Arrays.toString(stu));
    }
}
