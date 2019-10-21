package bjpowernode.chapter05;

import java.util.ArrayList;
import java.util.List;

/**
 * List集合的基本使用
 *
 * @author Huxzhi
 * @date 2019/10/19
 */
public class Test03 {
    public static void main(String[] args) {
        //创建List集合，List是一个接口，List接口引用需要赋值实现类对象
        List<String> list = new ArrayList<>();

        list.add("jj");
        list.add("gg");
        list.add("dd");
        list.add("mm");
        list.add("mm");
        list.add("mm");

        System.out.println(list);
    }
}
