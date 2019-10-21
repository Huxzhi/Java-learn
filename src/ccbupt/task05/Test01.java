package ccbupt.task05;

/**
 * 1.	定义一个长方形Rectangle类，
 * 包含成员变量：width,height //宽和高
 * 成员方法：
 * （1）3个构造方法,无参构造方法Rectangle()可实现创建一个宽为2，高为1的默认长方形；
 * 带一个参数w的构造方法，可实现创建一个宽和高都为w的特殊长方形（正方形）；带两个参数w和h的构造方法，可创建一个宽为w高为h的长方形。
 * （2）display()方法：计算并输出长方形面积。
 * 主函数：创建3个长方形对象，分别使用三个构造方法初始化这三个对象，并输出这三个长方形对象的面积。
 *
 * @author Huxzhi
 * @date 2019/10/15
 */
public class Test01 {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.display();
        Rectangle r2 = new Rectangle(2);
        r2.display();
        Rectangle r3 = new Rectangle(4, 2);
        r3.display();
    }

}

class Rectangle {
    private double width;
    private double height;

    Rectangle() {
        width = 2;
        height = 1;
    }

    Rectangle(double w) {
        width = height = w;
    }

    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    void display() {
        System.out.println("宽为" + width + "高为" + height + "的长方形面积为：" + width * height);
    }
}