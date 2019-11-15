package ccbupt.task09;

public class Test01 {
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