package ccbupt.task06.test01;

/**
 * （1）定义Person类，包括以下内容（20分）
 * 3个成员变量：id,name,sex；
 * 2个成员方法：printInfo()用于输出id,name,sex；
 * setInfo()用于设置id,name,sex的值。
 * （2）定义子类Student继承自Person类，新增以下成员
 * 1个成员变量：num；
 * 2个成员方法：printInfo()方法，用于输出id,name,sex,num；
 * setInfo()用于设置id,name,sex,num的值
 * （3）定义测试类Test，包含主函数，在主函数中创建Person类和Student类的对象，
 * 设置这两个对象的信息并输出。
 *
 * @author Huxzhi
 * @date 2019/10/18
 */
public class Test01 {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setInfo("123465", "小明", '男');
        p1.printInfo();
        System.out.println();
        Student s1 = new Student();
        s1.setInfo("112345", "小红", '女', 15);
        s1.printInfo();
    }

}

class Person {
    String id;
    String name;
    char sex;

    void printInfo() {
        System.out.print(id + " " + name + " " + sex);
    }

    void setInfo(String id, String name, char sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }
}

class Student extends Person {
    int num;

    void printInfo() {
        super.printInfo();
        System.out.print(" " + num);
    }

    void setInfo(String id, String name, char sex, int num) {
        super.setInfo(id, name, sex);
        this.num = num;
    }
}

