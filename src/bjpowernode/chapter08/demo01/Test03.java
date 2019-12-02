package bjpowernode.chapter08.demo01;

import java.lang.reflect.Field;

/**
 * 通过反射技术访问字段
 * <p>
 * class1.getField（字段名）返回指定字段名的公共字段
 * field.set（对象名，字段的值）；设置字段的值
 * class1.getDeclaredField（字段名）返回指定名称的字段（即使它是私有的）
 * field.set（对象名，字段的值）；设置字段的值
 * field.get（对象名）；返回字段的值
 * ageF.setAccessible(true);设置字段的可访问性
 *
 * @author Huxzhi
 * @date 2019/12/2
 */
public class Test03 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        //1)创建Class对象
        Class<?> class1 = Person.class;

        //2)反射name字段
        Field nameF = class1.getField("name");

        //3）通过反射技术创建对象（实例），默认调用类的无参构造
        Object p1 = class1.newInstance();
        //相当于new Person（）

        //4）设置字段的值
        nameF.set(p1, "lisi");
        //==p1.setName("lisi");

        //5)返回字段的值
        System.out.println(p1);
        System.out.println(nameF.get(p1));
        //==p1.getName();

        //访问私有字段： age
        //Field ageF = class1.getField("age");
        //只能返回公共字段
        Field ageF = class1.getDeclaredField("age");
        ageF.setAccessible(true);
        //设置字段的可访问性

        //返回字段
        ageF.set(p1, 18);
        System.out.println(ageF.get(p1));
        System.out.println(p1);
    }
}
