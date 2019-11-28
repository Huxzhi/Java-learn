package bjpowernode.chapter06.objectinputoutput;

import java.io.Serializable;

/**
 * Person类的对象序列化/反序列化的前提是Person类实现Serializable接口
 * 该接口没有任何方法
 * 一般情况下，类实现了Serializable接口后，会手动的添加一个serialVersionUID序列化版本号字段
 *
 * @author Huxzhi
 * @date 2019/11/28
 */
public class Person implements Serializable {
    String name;
    int age;
    //手动添加一个序列化版本号字段
    private static final long serialVersionUID = -6849794980754667710L;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
