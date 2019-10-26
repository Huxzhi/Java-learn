package bjpowernode.chapter05.map;
/**
 * Map的基本使用
 *
 * @author Huxzhi
 * @date 2019/10/26
 */

import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        //1）创建Map集合，存储<员工姓名，工资>，
        //Map是一个接口
        Map<String, Integer> map = new HashMap<>();

        //2)添加数据，put(k,v)
        map.put("yong", 100000);
        map.put("du", 50000);
        map.put("feifei", 40000);
        map.put("ming", 3000);

        //3)直接打印，存储顺序与添加顺序可能不一样
        System.out.println(map);

        //4）put添加数据时，键已存在
        map.put("ming", 3001);
        //键已存在，使用新的值3001替换原来的值
        System.out.println(map);

        //5)判断
        System.out.println(map.size());
        System.out.println(map.containsKey("yong"));
        System.out.println(map.containsValue(100000));

        //6)feifei的工资
        System.out.println(map.get("feifei"));
        System.out.println(map.get("zhang"));
        //键不存在

        //7)修改，替换
        map.replace("ming", 3003);
        System.out.println(map);
        map.replace("zhang", 88888);
        System.out.println(map);
        //当前map中不存在zhang这个键,无影响

        //8)删除
        map.remove("yong");
        System.out.println(map);
        map.remove("ming", 3000);
        System.out.println(map);

        //9)返回所有键的集合
        Set<String> keySet = map.keySet();
        System.out.println(keySet);

        //10)返回所有值得集合
        Collection<Integer> values = map.values();
        Iterator<Integer> iterator = values.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            System.out.print(integer + "\t");
        }
        System.out.println();

        //11)返回所有Entry的集合
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry :
                entrySet) {
            System.out.println(entry.getKey() + ":" + entry.getValue());

        }
    }
}
