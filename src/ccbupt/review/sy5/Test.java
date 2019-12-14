package ccbupt.review.sy5;

/**
 * 设计抽象类Shape，包含输出周长的方法；
 * 定义Shape类的子类圆类Circle和长方形类Rectangle，
 * 重写输出周长的方法。在主函数中创建圆类和长方形类对象各3个，
 * 将这些对象转换成Shape类型后，用for循环输出各个对象的周长。
 *
 * @author Huxzhi
 * @date 2019/12/11
 */
abstract class Shape {
    abstract void printCir();
}

class Circle extends Shape {
    double radius;

    @Override
    void printCir() {
        System.out.println(2 * 3.14 * radius);
    }

    Circle(double r) {
        radius = r;
    }
}

class Rectangle extends Shape {
    double length, width;

    @Override
    void printCir() {
        System.out.println((length + width) * 2);
    }

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }
}

public class Test {
    public static void main(String[] args) {
        Shape s[] = new Shape[2];
        s[0] = new Circle(2);
        s[1] = new Rectangle(3, 4);
        for (int i = 0; i < s.length; i++) {
            s[i].printCir();
        }
    }

}
