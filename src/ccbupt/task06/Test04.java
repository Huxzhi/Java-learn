package ccbupt.task06;

/**
 * 定义一个Person类（20分）
 * ①成员属性：Person类的属性（变量）。
 * 姓名：name，字符串类型：String；
 * 性别：sex，字符型：char；
 * 年龄：age，整形：int；
 * ②2个重载构造函数。
 * 第一个可通过参数初始化姓名、性别，年龄默认初始化为18；
 * 第二个可通过参数初始化所有属性。
 * ③一个成员方法。
 * public String toString（）//输出所有属性值
 * 二、定义一个学生类Student，他继承自Person类
 * ①增加自己的成员变量。
 * 学号：no，字符类型：String
 * 英语课成绩：scoreOfEn，双精度型：double
 * 英语课成绩：scoreOfMath，双精度型：double
 * 英语课成绩：scoreOfCh，双精度型：double
 * ②子类新增加的方法。
 * 设置每门课成绩；
 * 输出每门课成绩；
 * 求三门功课的平均成绩aver（）：该方法没有参数，返回值类型为double型。
 * 求三门功课的最高分max（）：该方法没有参数，返回值类型为double型。
 * 求三门功课的最低分min（）：该方法没有参数，返回值类型为double型。
 * ③覆盖父类的同名方法
 * 覆盖父类的同名方法toString（）：输出学号、姓名、性别、平均分、最高分、最低分信息。
 * 定义主函数，对这两个类进行测试。
 *
 * @author Huxzhi
 * @date 2019/10/18
 */
public class Test04 {

    public static void main(String[] args) {
        Person p1 = new Person("小明", '男');
        System.out.println(p1);
        Person p2 = new Person("小明", '男', 28);
        System.out.println(p2);
        Student s1 = new Student("小明", '男', "18160217", 89, 84.5, 92.5);
        System.out.println(s1);
    }

}

class Person {
    String name;
    char sex;
    int age;

    public Person(String name, char sex) {
        super();
        this.name = name;
        this.sex = sex;
        this.age = 18;
    }

    public Person(String name, char sex, int age) {
        super();
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", sex=" + sex + ", age=" + age + "]";
    }

}

class Student extends Person {
    String no;
    double scoreOfEn;
    double scoreOfMath;
    double scoreOfCh;

    public Student(String name, char sex, String no, double scoreOfEn,
                   double scoreOfMath, double scoreOfCh) {
        super(name, sex);
        this.no = no;
        this.scoreOfEn = scoreOfEn;
        this.scoreOfMath = scoreOfMath;
        this.scoreOfCh = scoreOfCh;
    }

    public double getScoreOfEn() {
        return scoreOfEn;
    }

    public void setScoreOfEn(double scoreOfEn) {
        this.scoreOfEn = scoreOfEn;
    }

    public double getScoreOfMath() {
        return scoreOfMath;
    }

    public void setScoreOfMath(double scoreOfMath) {
        this.scoreOfMath = scoreOfMath;
    }

    public double getScoreOfCh() {
        return scoreOfCh;
    }

    public void setScoreOfCh(double scoreOfCh) {
        this.scoreOfCh = scoreOfCh;
    }

    double aver() {
        return (scoreOfCh + scoreOfEn + scoreOfMath) / 3.0;
    }

    double max() {
        if (scoreOfCh > scoreOfEn) {
            scoreOfEn = scoreOfCh;
        }
        if (scoreOfMath > scoreOfEn) {
            scoreOfEn = scoreOfMath;
        }
        return scoreOfEn;
    }

    double min() {
        if (scoreOfCh < scoreOfEn) {
            scoreOfEn = scoreOfCh;
        }
        if (scoreOfMath < scoreOfEn) {
            scoreOfEn = scoreOfMath;
        }
        return scoreOfEn;
    }

    @Override
    public String toString() {
        return "name=" + name + ", sex=" + sex + ", age=" + age + "]"
                + "最高分：" + max() + "最低分：" + min() + "平均分：" + max();
    }


}