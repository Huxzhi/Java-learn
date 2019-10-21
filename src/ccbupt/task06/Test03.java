package ccbupt.task06;

/**
 * 定义形状类Shape，包含一个方法printName()用于输出形状名称。
 * 定义它的子类长方形类，圆形类，三角形类，这几个类重写父类的printName()方法，并新增求各自形状面积的方法。
 * 在主函数中创建这三个子类对象，输出每个对象的形状名称和面积。（20分）
 * 注：Shape类printName()要输出什么呢，请问？
 * 输出“我也不知道这是个什么形状！”或者“无名状”或者随便什么东西。
 *
 * @author Huxzhi
 * @date 2019/10/18
 */
public class Test03 {

    public static void main(String[] args) {
        Shape s1 = new Shape();
        s1.printName();
        Cfx c1 = new Cfx(12, 6);
        c1.printName();
        c1.area();
        Yuan y1 = new Yuan(3);
        y1.printName();
        y1.area();
        Sanjiaoxing sjx = new Sanjiaoxing(3, 6);
        sjx.printName();
        sjx.area();
    }

}

class Shape {
    void printName() {
        System.out.println("我也不知道这是个什么形状！");
    }
}

class Cfx extends Shape {
    double a;
    double b;

    public Cfx(double a, double b) {
        super();
        this.a = a;
        this.b = b;
    }

    void printName() {
        System.out.println("长方形");
    }

    void area() {
        System.out.println("面积：" + a * b);
    }
}

class Yuan extends Shape {
    private static final double PI = 3.14;
    double r;

    public Yuan(double r) {
        super();
        this.r = r;
    }

    void printName() {
        System.out.println("圆");
    }

    void area() {
        System.out.println("面积：" + r * r * PI);
    }
}

class Sanjiaoxing extends Shape {
    double a;
    double b;

    public Sanjiaoxing(double a, double b) {
        super();
        this.a = a;
        this.b = b;
    }

    void printName() {
        System.out.println("长方形");
    }

    void area() {
        System.out.println("面积：" + a * b / 2);
    }
}
