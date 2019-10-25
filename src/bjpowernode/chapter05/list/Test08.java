package bjpowernode.chapter05.list;

import java.util.LinkedList;

/**
 * LinkedList新增的方法
 *
 * @author Huxzhi
 * @date 2019/10/25
 */
public class Test08 {
    public static void main(String[] args) {
        LinkedList<String > linkedList= new LinkedList();

        linkedList.add("lisi");
        linkedList.add("wangwu");
        linkedList.add("chenqi");

        System.out.println(linkedList);
        //分别在头部和尾部添加元素
        linkedList.addFirst("laowu");
        linkedList.addLast("yanmingjie");

        //[laowu，lisi，wangwu，chengi，yanmingjie]
        System.out.println( linkedList );


        //返回第一个元素，最后一个元素
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        //删除第一个元素，删除最后一个元素，在remove（）删除时，会把删除的元素返回
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);

        //模拟栈
        linkedList.push("xxxx");
        System.out.println(linkedList);
        System.out.println(linkedList.pop());

        //模拟队列
        linkedList.offer("ooooo");
        System.out.println(linkedList);
        System.out.println(linkedList.poll());
    }
}
