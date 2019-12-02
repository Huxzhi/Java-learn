package bjpowernode.chapter08.demo01;

public class Person {
    static {
        System.out.println("静态代码块，在类加载内存后执行");
    }

    public String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void show() {
        System.out.println("name:" + name + ",age:" + age);
    }

    public void set(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
