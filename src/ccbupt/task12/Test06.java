package ccbupt.task12;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入任意个16级学生的信息");
        int a = input.nextInt();
        for (int i = 0; i < a; i++) {

        }
    }
}

class Student {
    String num;
    String name;
    double score;

    public Student(String num, String name, double score) {
        this.num = num;
        this.name = name;
        this.score = score;
    }
}