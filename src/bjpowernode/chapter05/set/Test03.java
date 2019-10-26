package bjpowernode.chapter05.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet
 * （1）TreeSet实现了SortedSet接口，可以对元素自然排序，要求集合中的元素必须是可比较的
 *      （1）在创建TreeSet时，可以指定Comparator比较器
 *      （2）没有指定Comparator 比较器，要求元素的类实现Comparable接口
 * （2）TreeSet 底层是TreeMap向Treeset添加元素，实际上是把该元素作为键添加到了底层的TreelMap中。
 *          IreeSet 实际上就是TreeMap键的集合
 * @author Huxzhi
 * @date 2019/10/25
 */
public class Test03 {
    public static void main(String[] args) {
        //1）创建TreeSet集合，存储String，按字符串降序排序，指定Comparator比较器
        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        treeSet.add("xx");
        treeSet.add("jj");
        treeSet.add("oo");
        treeSet.add("gg");
        treeSet.add("dd");
        System.out.println(treeSet);

        //2)创建TreeSet集合，如果没有指定Comparator比较器，要求元素的类实现Comparable接口
        //TreeSet存储String类型字符串，String实现了Comparable接口
        TreeSet<String >treeSet2=new TreeSet<>();
        treeSet2.addAll(treeSet);
        System.out.println(treeSet2);

    }

}
