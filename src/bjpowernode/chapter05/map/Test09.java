package bjpowernode.chapter05.map;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * TreeMap
 * <p>
 * TreeMap中的键可以自定义排序
 *
 * @author Huxzhi
 * @date 2019/11/20
 */
public class Test09 {
    public static void main(String[] args) {

        TreeMap<String, Integer> treeMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        treeMap.put("yong", 10000);
        treeMap.put("du", 5000);
        treeMap.put("zhang", 8000);
        treeMap.put("feifei", 4000);
        treeMap.put("ming", 1000);

        //打印结果，根据姓名降序排序
        System.out.println(treeMap);

        //创建Treemap，如果没有通过构造方法指定Comparator比较器，根据Map中的键要实现Comparable接口
        TreeMap<String, Integer> treeMap2 = new TreeMap<>();
        treeMap2.putAll(treeMap);
        System.out.println(treeMap2);
    }
}
