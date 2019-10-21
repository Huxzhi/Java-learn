package ccbupt.task04;

/**
 * 编写一个圆类Circle，该类拥有：
 * 包含的成员变量：radius(半径)
 * 两个构造方法：
 * Circle( )                 // 将半径初始化为1
 * Circle(double  r )         // 将半径初始化为r
 * 三个成员方法
 * double getArea( )       //获取圆的面积，面积=Π*r*r
 * double getPerimeter( )   //获取圆的周长，周长=2*Π*r
 * void  show( )          //将圆的半径、周长、面积输出到屏幕
 * 创建两个Circle类对象c1,c2。c1的半径为1（使用Circle()构造方法初始化），
 * c2的半径为5.5。（pi=3.14）
 *
 * @author Huxzhi
 * @date 2019/10/10
 */
public class Circle {
    double radius;

    Circle() {
        radius = 1.0;
    }

    Circle(double r) {
        radius = r;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.show();
        Circle c2 = new Circle(5.5);
        c2.show();
    }

    double getArea() {
        return 3.14 * radius * radius;
    }

    double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    void show() {
        System.out.println("圆的半径：" + radius + "周长：" + getPerimeter() + "面积：" + getArea());
    }

}
