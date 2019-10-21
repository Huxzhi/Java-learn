package bjpowernode.chapter05;

import java.util.ArrayList;
import java.util.List;

/**
 * List集合为每个元素指定了一个索引值，主要增加了针对索引值的操作
 *
 * @author Huxzhi
 * @date 2019/10/19
 */
public class Test04 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("jj");
        list.add("gg");
        list.add("dd");
        list.add("mm");

        //3)在指定的索引值添加数据
        list.add(0, "NN");
        list.add(list.size(), "GG");
        System.out.println(list);

        //4)删除指定位置元素
        list.remove(1);
        System.out.println(list);

        //5)返回元素第一次出现的位置
        System.out.println(list.indexOf("mm"));
        System.out.println(list.lastIndexOf("mm"));

        //6)返回指定位置的元素
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
