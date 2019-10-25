package bjpowernode.chapter05.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * set集合
 *
 * @author Huxzhi
 * @date 2019/10/25
 */
public class Test01 {
    public static void main(String[] args) {
        //1)创建Set集合
        Set<String > set= new HashSet<>();
        //2)添加元素
        set.add("gg");
        set.add("jj");
        set.add("1234");
        set.add("dd");
        set.add("mm");

        //3)直接打印，存储顺序与添加顺序可能不一样
        System.out.println(set);
        //[gg, jj, dd, mm, 1234]

        //4)添加重复数据
        set.add("1234");
        set.add("dd");
        //[gg, jj, dd, mm, 1234]

        //5)迭代
        Iterator<String > iterator =set.iterator();
        while (iterator.hasNext()){
            String string= iterator.next();
            System.out.print(string);
        }

    }
}
