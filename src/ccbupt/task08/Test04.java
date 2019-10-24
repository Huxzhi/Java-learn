package ccbupt.task08;
/**
 * 4、（25分）提升，需预习抽象类完成该部分内容
 * （1）定义一个抽象类Shape，包含两个抽象方法printName(),printArea()用于输出形状名称和形状面积。
 * （2）定义圆形Circle类继承自Shape类，实现继承的成员方法，包含构造方法，成员变量根据需要定义。
 * （3）定义长方形Rectangle类继承自Shape类，实现继承的成员方法，包含构造方法，成员变量根据需要定义。
 * （4）定义三角形Triangle类继承自Shape类，实现继承的成员方法，包含构造方法，成员变量根据需要定义。
 * （5）定义主类Test，在主函数中创建一个圆、一个长方形、一个三角形，利用多态，使用循环的方法输出每个形状的名称和面积。
 *
 * @author Huxzhi
 * @date 2019/10/24
 */
public class Test04 {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(4);
        shape[1] = new Rectangle(2, 3);
        shape[2] = new Triangle(1.5, 4);
        for (int i = 0; i < shape.length; i++) {
            shape[i].printName();
            shape[i].printArea();
        }
    }
}

abstract class Shape {
    abstract void printName();

    abstract void printArea();
}

class Circle extends Shape {
    static final double PI = 3.14;
    double r;
    String Name = "Circle";

    Circle(double r) {
        this.r = r;
    }

    void printName() {
        System.out.println("Name:" + Name);
    }

    void printArea() {
        System.out.println("Area:" + PI * r * r);
    }
}

class Rectangle extends Shape {
    double a, b;
    String Name = "Rectangle";

    Rectangle(double a, double b) {
        this.a = a;
        this.b = a;
    }

    void printName() {
        System.out.println("Name:" + Name);
    }

    void printArea() {
        System.out.println("Area:" + a * b);
    }
}

class Triangle extends Shape {
    double a, b;
    String Name = "Triangle";

    Triangle(double a, double b) {
        this.a = a;
        this.b = a;
    }

    void printName() {
        System.out.println("Name:" + Name);
    }

    void printArea() {
        System.out.println("Area:" + a * b / 2);
    }
}