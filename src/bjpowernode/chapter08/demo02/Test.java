package bjpowernode.chapter08.demo02;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Properties;

/**
 * 有时会把类名保存到配置文件中，通过Properties读取配置文件的类名，通过反射创建对象
 *
 * @author Huxzhi
 * @date 2019/12/2
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        //读取配置文件的类名
        Properties properties = new Properties();
        InputStream inStream = Test.class.getResourceAsStream("/bjpowernode/chapter08/demo02/config.properties");
        properties.load(inStream);
        String className = properties.getProperty("classname");
        //通过反射技术，根据完整类名创建对象
        Class<?> class1 = Class.forName(className);

        Collection<?> collection = (Collection<?>) class1.newInstance();

    }
}
