package ccbupt.task05;

import java.util.Scanner;

/**
 * 2.	编程实现一个学生成绩管理系统。该系统能够录入n个学生信息，
 * 每个学生信息包括学号、姓名、成绩。要求每录入完一个学生信息，就输出当前学生总人数和所有学生平均成绩
 * （注：输出学生人数和平均成绩通过定义静态成员方法display()实现）。
 *
 * @author Huxzhi
 * @date 2019/10/15
 */
public class Test12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要录入的学生人数：");
        int a = input.nextInt();
        Student[] s = new Student[a];
        for (int i = 0; i < a; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的序号、名字、成绩：");
            s[i] = new Student(input.next(), input.next(), input.nextDouble());
            Student.display();
        }
    }

}

class Student {
    private String sno;
    private String name;
    private double grade;
    static int num = 0;
    static double ave = 0;

    public Student(String sno, String name, double grade) {
        super();
        this.sno = sno;
        this.name = name;
        this.grade = grade;
        num++;
        ave += grade;
    }

    static void display() {

        System.out.println("当前共有学生" + num + "人，所有学生平均成绩为：" + ave / num);

    }
}