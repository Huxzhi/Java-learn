package bjpowernode.chapter05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Collection集合的基本操作
 *
 * @author Huxzhi
 * @date 2019/10/19
 */
public class Test01 {
    public static void main(String[] args) {
        //1)创建Collection集合
        //Collection是一个接口，需要赋值实现类的对象
        Collection collection = new ArrayList();
        collection.add("abc");
        //添加基本类型数据时，系统自动装箱为包装类对象添加到集合
        collection.add(456);
        collection.add(true);

        //3）在实际应用中，一个集合一般只存储一个类型的数据，可以通过泛型约束集合中元素的类型
        //泛型就是把数据类型作为参数传递
        Collection<String> collection2 = new ArrayList<>();
        collection2.add("dd");
        collection2.add("mm");
        collection2.add("jj");
        collection2.add("dd");
        //通过泛型约束collection2集合只能存储String，如果添加其他类型的数据，就会编译错误
        //泛型的好处就是在编译时，可以进行数据类型的检查

        //4）直接打印
        System.out.println(collection2);
        /*当前co1lection2引用指向的是ArrayList集合的对象
         *在调用println（）方法时，把co1lection2变量的值，即ArrayList对象的引用作为println（）方法的实参
         */

        //5)判断
        System.out.println(collection2.isEmpty());
        System.out.println(collection2.size());
        System.out.println(collection2.contains("dd"));

        //6)删除jj
        collection2.remove("jj");
        System.out.println(collection2);

        //7)转换为数组
        String[] myArray = new String[collection2.size()];
        collection2.toArray(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
