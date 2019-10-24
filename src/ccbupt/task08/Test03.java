package ccbupt.task08;

/**
 * 3、（25分）简单的Java多态。
 * （1）定义一个Animal类，包含以下成员：
 * 1个成员方法：song()，该方法为空方法，什么都不输出；
 * （2）定义Monkey类，继承自Animal类，重写父类song()方法，实现输出：“Hoo,Hoo!”
 * （3）定义Chiken类，继承自Animal类，重写父类song()方法，实现输出：“WoWo!”
 * （4）定义Cow类，继承自Animal类，重写父类song()方法，实现输出：“MenMen!”
 * （5）定义Rabbit类，继承自Animal类，重写父类song()方法，实现输出：“BoBo!”
 * （6）在主函数中
 * 首先，创建一个Animal类型的数组，包含4个元素。创建猴、鸡、牛、兔子对象各一个，分别赋值给数组的四个元素。
 * 然后，输出：“请欣赏动物大合唱！”
 * 最后，通过for循环，依次使用数组的每个元素调用song()方法。
 */
public class Test03 {
    public static void main(String[] args) {
        Animal[] animal = new Animal[4];
        animal[0] = new Monkey();
        animal[1] = new Chiken();
        animal[2] = new Cow();
        animal[3] = new Rabbit();
        System.out.println("请欣赏动物大合唱！");
        for (int i = 0; i < animal.length; i++) {
            animal[i].song();
        }
    }
}

abstract class Animal {
    abstract void song();

}

class Monkey extends Animal {
    void song() {
        System.out.println("Hoo,Hoo!");
    }
}

class Chiken extends Animal {
    void song() {
        System.out.println("WoWO!");
    }
}

class Cow extends Animal {
    void song() {
        System.out.println("MenMen!");
    }
}

class Rabbit extends Animal {
    void song() {
        System.out.println("BoBo!");
    }
}