package bjpowernode.chapter05.list;

import java.util.ArrayList;
import java.util.Vector;

/**
 * ArrayList与Vector
 * 1）底层都是数组，Vector是线程安全的，Arraylist不是线程安全的
 * 2）初始化容量：10
 * 3）ArrayList扩容：1.5倍速，Vector扩容：2倍
 *
 * @author Huxzhi
 * @date 2019/10/25
 */
public class Test07 {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        list.add("dd");
        Vector<String> vector=new Vector<>();
        vector.add("hh");
    }
}
