package bjpowernode.chapter08.demo01;

import java.lang.reflect.Modifier;

/**
 * 反射类的信息
 *
 * @author Huxzhi
 * @date 2019/12/2
 */
public class Test02 {
    public static void main(String[] args) {
        //1）创建Class对象
        //Class<?> class1 = String.class;
        Class<?> class1 = Integer.class;

        StringBuilder sb = new StringBuilder();
        //2）反射类的信息
        //2.1修饰符
        int mod = class1.getModifiers();
        //方法返回类的修饰符，是一个整数
        String modifier = Modifier.toString(mod);
        sb.append(modifier);
        //2.2类名
        sb.append(" class  ");
        //sb.append(class1.getName());
        //getName()返回完整类名
        sb.append(class1.getSimpleName());
        //返回简易类名

        //2.3父类
        Class<?> superclass = class1.getSuperclass();
        //判断父类是否为Object
        if (Object.class != superclass) {
            sb.append(" extends  ");
            sb.append(superclass.getSimpleName());
        }

        //2.4接口,getInterfaces（）返回接口数组，如果类没有实现接口，返回的数组长度为0
        Class<?>[] interfaces = class1.getInterfaces();
        if (interfaces.length > 0) {
            //实现了接口
            sb.append(" implements  ");
            //遍历接口数组
            for (int i = 0; i < interfaces.length; i++) {
                sb.append(interfaces[i].getSimpleName());
                //接口之间使用逗号分隔
                if (i < interfaces.length - 1) {
                    sb.append(",");
                }
            }
        }

        System.out.println(sb);
    }
}
