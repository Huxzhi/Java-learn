package ccbupt.task12;
/**
 * 2.（15分）请编写程序实现以下内容：
 * 录入n个员工信息：这些信息包括员工编号（唯一）、个人简介(string 类型)。
 * 接着，进行m次问询，每次根据用户输入的员工编号输出该员工的个人简介。
 *
 * @author Huxzhi
 * @date 2019/11/15
 */

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Test02 {
    public static void main(String[] args) {
        String cyString;

        Scanner input = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        System.out.println("输入次数");
        int a = input.nextInt();

        for (int i = 0; i < a; i++) {
            System.out.println("输入编号");
            cyString = input.next();
            if (map.containsKey(cyString)) {
                System.out.println("重复了");
            } else {
                System.out.println("输入详细");
                String nrString = input.next();
                map.put(cyString, nrString);
            }

        }
        System.out.println("输入查找次数");
        int m = input.nextInt();

        for (int i = 0; i < m; i++) {
            System.out.println("输入编号");
            System.out.println("详细" + map.get(input.next()));
        }
    }
}
