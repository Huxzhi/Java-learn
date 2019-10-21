package ccbupt.task04;

import java.util.Scanner;

/**
 * 编写一个点Point类，
 * 成员变量：x, y     //分别表示一个点的x坐标和y坐标
 * 构造方法：用于初始化点的坐标x, y值
 * 成员方法：getX()   //返回点的x坐标
 * getY()   //返回点的y坐标
 * 在主函数中创建两个点的对象p1,p2，由用户输入这两个点的位置（位置可自行设置），
 * 求这两个点的距离。（两点间距离公式：√(〖(x1-x2)〗^2+〖(y1-y2)〗^2 )
 * 说明：Math.pow(27, 3)求27的三次方，Math.sqrt(4)，对4开方
 *
 * @author Huxzhi
 * @date 2019/10/10
 */
public class Point {
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个点的位置");
        Point p1 = new Point(input.nextDouble(), input.nextDouble());
        System.out.println("请输入第二个点的位置");
        Point p2 = new Point(input.nextDouble(), input.nextDouble());
        System.out.println(Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2)));
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

}
