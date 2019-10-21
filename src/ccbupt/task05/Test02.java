package ccbupt.task05;

import java.util.Scanner;

/**
 * 2.	定义一个类Weight，包括两个静态的成员方法forMale(double h)用于计算男子标准体重、forFemale(double h)用于计算女子的标准体重，两个方法均返回标准体重值。在主函数中根据用户输入的身高和性别，计算其标准体重。
 * 计算公式：
 * 男标准体重=(身高cm-100)*0.9(kg)
 * 女标准体重=(身高cm-100)*0.9(kg)-2.5(kg)
 * 提示：输入字符串input.next().toCharArray()[0]。
 *
 * @author Huxzhi
 * @date 2019/10/15
 */
public class Test02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输身高（厘米）和性别（m or f）");
        double h = input.nextDouble();
        char sex = input.next().toCharArray()[0];
        if (sex == 'f') {
            System.out.println("标准体重为：" + Weight.forFemale(h));
        } else if (sex == 'm') {
            System.out.println("标准体重为：" + Weight.forMale(h));
        } else {
            System.out.println("ERROR");
        }
    }

}

class Weight {
    static double forMale(double h) {
        return (h - 100) * 0.9;
    }

    static double forFemale(double h) {
        return (h - 100) * 0.9 - 2.5;
    }
}