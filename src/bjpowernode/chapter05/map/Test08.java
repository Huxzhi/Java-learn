package bjpowernode.chapter05.map;

import java.util.ResourceBundle;

/**
 * 使用ResouceBundle加载配置文件
 *
 * @author Huxzhi
 * @date 2019/11/19
 */
public class Test08 {
    public static void main(String[] args) {
        //加载资源时，不需要扩展名（前提配置文件的扩展名必须是properties），也不需要斜杠开头
        ResourceBundle bundle = ResourceBundle.getBundle("bjpowernode/chapter05/resources/config");
        System.out.println(bundle.getString("username"));
        System.out.println(bundle.getString("password"));
    }
}
