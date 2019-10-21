package ccbupt.task04;

import java.util.Scanner;

/**
 * 定义计算机Calculator类，能根据用户输入的两个数字和运算符，进行计算。
 * 成员变量：number1, number2，operator//分别表示两个数字和运算符
 * 构造方法：初始化number1,number2，operator
 * 1个成员方法：可根据输入的两个数和运算符计算结果。
 * 在主函数中创建Calculator类的对象，分别进行加、减、乘、除运算。
 * 说明：读取单个字符的方法input.next().toCharArray()[0]，读取字符串的方法input.next()
 *
 * @author Huxzhi
 * @date 2019/10/10
 */
public class Calculator {
    double number1;
    double number2;
    char operator;

    public Calculator(double number1, double number2, char operator) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入运算次数：");
        int a = input.nextInt();
        Calculator[] c = new Calculator[a];
        for (int i = 0; i < a; i++) {
            System.out.println("请输入第" + (i + 1) + "次运算的两个数和运算符：");
            c[i] = new Calculator(input.nextDouble(), input.nextDouble(), input.next().toCharArray()[0]);
            System.out.println("结果为：" + c[i].jisuan());
        }
    }

    public double jisuan() {
        switch (operator) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            case '/':
                return number1 / number2;
            default:
                break;
        }
        return 0.0;
    }

}
