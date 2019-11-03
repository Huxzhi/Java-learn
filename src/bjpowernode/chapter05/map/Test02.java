package bjpowernode.chapter05.map;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 1)统计每个字符出现的次数
 * a:12
 * b:2
 * c:2
 *
 * @author Huxzhi
 * @date 2019/10/26
 */
public class Test02 {
    public static void main(String[] args) {
        String text = "afdasfafdafafvczvfdsfdasfgjgfkljgaslkjcmvmzxjlkadsjflkaj";

        //1)
        Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < text.length(); i++) {
            char cc = text.charAt(i);
            ////2.1如果该字符是第一次出现（map中的键不包含该字符），把<字符，1>添加到map中
            if (!map.containsKey(cc)) {
                map.put(cc, 1);
            } else {
                ////2.2如果该学符不是第一次出现，把map中该字符的次数取出来加1再保存到map中
                int count = map.get(cc);
                map.replace(cc, count + 1);
            }
        }
        //打印结果
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
