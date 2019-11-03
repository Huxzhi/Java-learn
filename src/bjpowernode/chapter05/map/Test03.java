package bjpowernode.chapter05.map;


import java.util.*;

/**
 * map应用
 *
 * @author Huxzhi
 * @date 2019/11/3
 */
public class Test03 {
    public static void main(String[] args) {
        String text = "yang@163.com,ming@163.com,du@sohu.com,yong@sohu.com,zhang@qq.com,feifei@sohu.com";
        String[] words = text.split("[,@]");
        //分别把邮箱名和邮箱地址保存到一个Map中<yang，163.com>
        //把把这些map再保存到Set集合，
        Set<Map<String, String>> set = new HashSet<>();
        for (int i = 0; i < words.length; i += 2) {
            Map<String, String> map = new HashMap<>();
            map.put(words[i], words[i + 1]);
            set.add(map);
        }
        System.out.println(set);

        //统计每个邮箱的数量

        Map<String, Integer> map2 = new HashMap<>();
        for (int i = 1; i < words.length; i += 2) {
            if (!map2.containsKey(words[i])) {
                map2.put(words[i], 1);
            } else {
                int count = map2.get(words[i]);
                map2.replace(words[i], count + 1);
            }
        }
        //输出map2
        Set<Map.Entry<String, Integer>> entrySet = map2.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet
        ) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }
    }
}
