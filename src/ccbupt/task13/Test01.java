package ccbupt.task13;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 1.（20分）输入n条学生信息，每条学生信息包括学号、姓名、性别、学期总成绩，
 * 要求统计学生中男生人数、女生人数、所有学生的平均成绩、所有姓王的同学数量，
 * 写入到当前目录下，名为“学生信息统计”的文本文件内。
 *
 * @author Huxzhi
 * @date 2019/11/21
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("输入n条学生信息");
        int n = input.nextInt();
        Student[] student = new Student[n];
        int f = 0;
        int m = 0;
        double ave = 0.0;
        int wang = 0;
        for (int i = 0; i < n; ) {
            input = new Scanner(System.in);
            System.out.println("请输入学生信息,（信息包括学号、姓名、性别、学期总成绩,用空格隔开）");
            String line = input.nextLine();
            String[] items = line.split("\\s+");
            if (items.length != 4) {
                System.out.println("信息错误，缺少或过多");
                continue;
            }
            if (!("男".equals(items[2]) || "女".equals(items[2]))) {
                System.out.println("性别错误");
                continue;
            }
            student[i] = new Student(items[0], items[1], items[2].charAt(0), Double.parseDouble(items[3]));
            i++;
            if ("男".equals(items[2])) {
                m++;
            } else {
                f++;
            }
            if (items[1].startsWith("王")) {
                wang++;
            }
            ave += Double.parseDouble(items[3]);
        }

        String path = "src/ccbupt/task13/学生信息统计.txt";
        File file = new File(path);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        file.createNewFile();
        FileWriter fw = new FileWriter(file, false);
        fw.write("男生数：" + m + "\n");
        fw.write("女生数：" + f + "\n");
        fw.write("平均成绩：" + ave / n + "\n");
        fw.write("王姓同学数：" + wang + "\n");
        fw.close();
    }
}

class Student {
    String num;
    String name;
    char sex;
    double total;

    public Student(String num, String name, char sex, double total) {
        this.num = num;
        this.name = name;
        this.sex = sex;
        this.total = total;
    }
}
