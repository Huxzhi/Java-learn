package ccbupt.task12;
/**
 * 1.（1.（15分）请编写程序实现以下内容：
 * 根据用户输入的人数n，读取n个人的国籍(国籍以英文形式输入)，
 * 请统计不同国籍数并将不同的国籍按照字典序升序输出。15分）
 * 请编写程序实现以下内容：根据用户输入的人数n，读取n个人的国籍(国籍以英文形式输入)，
 * 请统计不同国籍数并将不同的国籍按照字典序升序输出。
 *
 * @author Huxzhi
 * @date 2019/11/15
 */

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Test01 {
    public static void main(String[] args) {
        String cyString;
        Scanner input = new Scanner(System.in);
        Map<String, Integer> map = new TreeMap<>();
        System.out.println("请输入人数个数：");
        int a = input.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println("请输入此人的国籍(国籍以英文形式输入)");
            cyString = input.next();
            if (map.containsKey(cyString)) {
                map.replace(cyString, map.get(cyString) + 1);
            } else {
                map.put(cyString, 1);
            }
        }
        System.out.println(map);
    }
}
