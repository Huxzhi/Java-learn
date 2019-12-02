package bjpowernode.chapter08.demo01;

/**
 * 创建Class对象的方式
 *
 * @author Huxzhi
 * @date 2019/12/1
 */
public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //1)每个类都有一个Class属性
        Class class1 = Test01.class;

        //2)每个对象有getClass()
        Class class2 = new Test01().getClass();

        //3)Class.forName()
        Class class3 = Class.forName("bjpowernode.chapter08.demo01.Test01");

        System.out.println(class1);
        System.out.println(class1 == class2);
        System.out.println(class3 == class2);

        //4)
        Class<?> class4 = int.class;
        Class<?> class5 = Integer.class;
        System.out.println(class4 == class5);
        //false
        Class<?> class6 = Integer.TYPE;
        System.out.println(class4 == class6);
        //true

        //5)Class.forName()返回Class对象时，会把参数指定的类加载到内存中
        //Class<?> class7 = Person.class;
        //没有执行Person类静态代码块，说明Person类没有加载内存
        //Class<?> class8 = Class.forName("bjpowernode.chapter08.demo01.Person");
        //执行了静态代码快，说明类加载了内存
        Object obj = Person.class.newInstance();
    }
}
