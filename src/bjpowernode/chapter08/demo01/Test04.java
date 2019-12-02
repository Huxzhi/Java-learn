package bjpowernode.chapter08.demo01;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 通过反射技术调用方法
 * <p>
 * c1ass1.getMethod（方法名，参数类型列表）反射指定方法签名的公共方法v
 * <p>
 * method.invoke（实例名，方法的实参列表）调用方法
 *
 * @author Huxzhi
 * @date 2019/12/2
 */
public class Test04 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        //1)创建Class对象
        Class<?> class1 = Person.class;

        //2)反射show()方法
        Method showM = class1.getMethod("show", null);

        //3)通过反射技术创建实例 new Person()
        Object obj = class1.newInstance();

        //4)调用方法==obj.show()
        showM.invoke(obj, null);

        //5)反射set(String,int)方法
        Method setM = class1.getMethod("set", String.class, int.class);
        setM.invoke(obj, "lisi", 66);

        showM.invoke(obj);
        System.out.println(obj);
    }
}
