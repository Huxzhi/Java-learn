package bjpowernode.chapter05.map;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * TreeMap
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

        System.out.println(treeMap);
    }
}
