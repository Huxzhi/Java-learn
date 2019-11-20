package bjpowernode.chapter05.map;

import java.util.Properties;

/**
 * Properties
 * 继承了HashTable
 * 它的键与值都是String字符串
 * 常用于设置读取系统属性值
 * 常用的两个方法：setProperty（属性名，属性值）getProperty（属性名）
 *
 * @author Huxzhi
 * @date 2019/11/19
 */
public class Test06 {
    public static void main(String[] args) {
        //创建Properties对象时，不需要泛型
        Properties properties = new Properties();

        //设置属性
        properties.setProperty("username", "bjpowernode");
        properties.setProperty("password", "123");

        //读取系统属性
        System.out.println(properties.get("username"));
        System.out.println(properties.get("password"));
    }
}
