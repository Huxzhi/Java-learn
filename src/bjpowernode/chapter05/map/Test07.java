package bjpowernode.chapter05.map;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 1）经常把属性保存到配置文件中
 * 2）一般情况下，会在当前工程中单独创建一个资源包，在该包中添加配置文件，配置文件的后缀名是.properties
 * 在src目录中.java源文件自动编译为.class保存到bin目录中，src目录中非.java源文件自动复制到bin目录中
 * 3）可以使用Properties读取配置文件的属性
 *
 * @author Huxzhi
 * @date 2019/11/19
 */
public class Test07 {
    public static void main(String[] args) throws IOException {
        //创建Properties对象
        Properties properties = new Properties();
        //加载配置文件
//      InputStream inStream = Test07.class.getResourceAsStream("/bjpowernode/chapter05/resources/config.properties");
        //如果在多线程程序中，也可以使用以下方式
        InputStream inStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("bjpowernode/chapter05/resources/config.properties");
        //如果本行出现空指针异常，一般就是资源文件路径不正确
        properties.load(inStream);
        //读取配置信息
        System.out.println(properties.getProperty("username"));
        System.out.println(properties.get("password"));
    }
}
