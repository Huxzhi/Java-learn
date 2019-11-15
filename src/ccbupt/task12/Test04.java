package ccbupt.task12;

import java.util.*;

/**
 * 4．（20分）编写程序实现以下内容：
 * 用户输入n，随机生成n个随机大写字母，输出每个字母及字母个数；
 * 用户输入m，表示要把其中m种字母删除，接下来用户输入要删除的m种字母，
 * 如果用户输入的字母不存在，提示用户重新输入。
 * 最后把删除m种字母后剩余的字母总数、每种字母及每种字母的个数输出。
 *
 * @author Huxzhi
 * @date 2019/11/15
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap();
        System.out.println("随机生成n个随机大写字母");
        int n = input.nextInt();
        int f = 0;
        int c;
        char[] a = new char[n];
        for (int i = 0; i < a.length; i++) {
            Random random = new Random();
            a[i] = (char) ('A' + random.nextInt(26));
        }
        System.out.println(a);
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                char b = a[i];
                map.put(a[i], map.get(b) + 1);
            } else {
                map.put(a[i], 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();

        for (Map.Entry<Character, Integer> entry : entries) {
            f++;
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }
        System.out.println("其中m种字母删除");
        while (true) {
            c = input.nextInt();
            if (c > f) {
                System.out.println("超出包含的字母个数，请重新输入");
            } else {
                System.out.println("删除" + c + "个字母，请输入字母：");
                break;
            }
        }
        char[] d = new char[c];
        for (int i = 0; i < d.length; i++) {
            while (true) {
                char e = input.next().charAt(0);
                if (!map.containsKey(e)) {
                    System.out.println("不存在该字母或该字母已被删除");
                } else {
                    map.remove(e);
                    System.out.println("字母" + e + "删除成功");
                    break;
                }
            }
        }
    }
}
