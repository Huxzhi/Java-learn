package ccbupt.task12;

import java.util.*;
import java.util.Iterator;
/**
 * 6.（15分）编写程序，实现可输入任意个16级学生的信息，每个学生的信息包括学号、姓名、总成绩，
 * 用户输入0时，结束输入，并输出所有学生信息。要求对以下异常进行处理：
 * （1）学号应为8位且以16开头，如果不满足，提示用户学号输入不正确；
 * （2）学号和成绩为整数，如果输入为非整数，提示用户输入的学号或成绩为非整数。
 *
 * @author Huxzhi
 * @date 2019/11/18
 */



public class Test06 {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        System.out.println("输入任意个16级学生的信息(输入0时，结束输入)");
        while (true){
            try {Scanner input = new Scanner(System.in);
                System.out.println("     学号       姓名     总成绩");
                int num = input.nextInt();
                if (num==0){
                    break;
                }
                if(num<16000000||num>=17000000){
                    throw new Exception("学号输入不正确");
                }
                String name = input.next();
                int grade=input.nextInt();
                Student student=new Student(num,name,grade);
                list.add(student);
                System.out.println("请输入下一个16级学生的信息：");
            } catch (InputMismatchException e) {
                System.out.println("错误，请输入整型数据");
            } catch (Exception e) {
                System.out.println("学号错误，请重新输入16级学生信息");
            }
        }
        Iterator<Student> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}

class Student {
    private int num;
    private String name;
    private int grade;

    @Override
    public String toString() {
        return "Student{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    public Student(int num, String name, int grade) {
        this.num = num;
        this.name = name;
        this.grade = grade;
    }
}