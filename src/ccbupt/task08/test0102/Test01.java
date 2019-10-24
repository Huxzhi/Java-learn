package ccbupt.task08.test0102;

/**
 * 1、猴和人(25分)
 * （1）定义Monkey类，包括以下成员:
 * 2个成员变量：id,height,weight；
 * 2个成员方法：printInfo(),用于输出id,height,weight；
 * sayHello(),可输出“HOO,WOO!”
 * 1个构造方法（三个参数）：用于初始化用于初始化
 * （2）定义子类People继承自Monkey类，新增以下成员
 * 1个成员变量：country；
 * 2个成员方法：printInfo()方法，用于输出：id,height,weight,country
 * sayHello ()方法，用于输出：“你好！”
 * 1个构造方法：用于初始化所有成员变量
 * （3）在主函数中创建一个猴儿对象和一个人对象（通过构造方法初始化，初值任意），
 * 让猴和人分别自我介绍并跟大家打招呼。
 *
 * 在上一题的基础上，再定义一个Chinese类继承自People类，该类新增以下成员：
 * 1个成员变量：province   //省
 * 1个成员方法：printInfo()，用于输出：id,height,weight,country,province
 * 1个构造方法：用于初始化所有成员变量
 * @author Huxzhi
 * @date 2019/10/24
 */
public class Test01 {
    public static void main(String[] args) {
        Monkey a = new Monkey(1, 145, 537);
        People b = new People(2, 54, 186, "www");
        a.printlnfo();
        a.sayHello();
        b.printInfo();
        b.sayHello();
        Chinese c = new Chinese(3, 8, 179, "zhejiang", "dalu");
        c.printInfo();
        c.sayHello();
    }
}

class Monkey {
    int id;
    double height;
    double weight;

    void printlnfo() {
        System.out.print(id + " " + height + " " + weight);
    }

    void sayHello() {
        System.out.println("HOO,WOO!");
    }

    public Monkey(int id, double height, double weight) {
        super();
        this.id = id;
        this.height = height;
        this.weight = weight;
    }

}

class People extends Monkey {
    String country;

    public People(int id, double height, double weight, String country) {
        super(id, height, weight);
        this.country = country;
    }

    void printInfo() {
        super.printlnfo();
        System.out.print(" " + country);
    }

    void sayHello() {
        System.out.print("你好\n");
    }
}

class Chinese extends People {
    String povince;

    void printInfo() {
        super.printlnfo();
        System.out.print(" " + povince);
    }

    public Chinese(int id, double height, double weight, String country,
                   String povince) {
        super(id, height, weight, country);
        this.povince = povince;
    }

}
