package ccbupt.task05;

import java.util.Scanner;

/**
 * 1.	设计SubRectangle（长方形）类，
 * 成员变量：width, height   //宽和高
 * 包含成员方法：
 * 构造方法：根据用户从键盘输入的宽和高初始化width和height
 * 成员方法：subRectangle（SubRectangle r1）,用于实现计算 两个长方形的面积差并输出
 * 主函数：创建两个Rectangle类的对象，并调用subRectangle方法求这两个长方形的面积差。
 * 提示：求绝对值的方法Math.abs（a），为求a的绝对值；
 * 注：成员变量定义成私有的，成员方法定义成共有的
 *
 * @author Huxzhi
 * @date 2019/10/15
 */
public class Test11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个长方形的宽和高：");
        SubRectangle r1 = new SubRectangle(input.nextDouble(), input.nextDouble());
        System.out.println("请输入第二个长方形的宽和高：");
        SubRectangle r2 = new SubRectangle(input.nextDouble(), input.nextDouble());
        System.out.println("面积差为：" + r1.subRectangle(r2));
    }

}

class SubRectangle {
    private double width;
    private double height;

    public SubRectangle(double w, double h) {
        width = w;
        height = h;
    }

    public double subRectangle(SubRectangle r1) {
        return Math.abs(this.width * this.height - r1.height * r1.width);
    }
}