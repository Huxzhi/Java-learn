package bjpowernode.chapter05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection迭代
 *
 * @author Huxzhi
 * @date 2019/10/19
 */
public class Test02 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("jj");
        collection.add("mm");
        collection.add("dd");
        collection.add("mm");
        collection.add("dd");

        System.out.println(collection);
        //迭代遍历集合的每个元素
        Iterator<String> iterator = collection.iterator();
        /*
         * 获得了迭代器后，选代有一个游标，指向集合第一个元素的前面
         * hasNext()判断是否还有下个元素
         * next()返回下个元素，游标下移
         */
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.print(str + "\t");
        }

        //iterator迭代器的游标，经过while循环后，指向最后一个元素的后面，需要重新获得迭代器对象
        iterator = collection.iterator();
        while (iterator.hasNext()) {
            String string = (String) iterator.next();
            if ("dd".equals(string)) {
                //只能通过迭代器删除
                iterator.remove();
                //java.util.ConcurrentModificationException
//                collection.remove("dd");
            }
        }
        System.out.println(collection);
        /**
         * 注意，当已经获得了Iterator选代器之后，如果再通过Collection集合的add（）/remove（）/clear（）等方法修改了集合的结构
         * 再使用选代器的next（）方法返回下个元素时，可能会出现java.util.ConcurrentModificationException异常
         */
    }
}
