package ccbupt.task12;
/**
 * 3.（15分）编写程序实现以下内容：
 * 有一些同学报名参加合唱团，你将他们的学号记录下来；过了2天，
 * 合唱团老师给了你一个名单，包含一些学生的学号，名单中的学生因为一些原因无法参加合唱团了。
 * 请将这些学生的学号从报名的学生中移除，并把剩余的学生按照学号升序输出。
 *
 * @author Huxzhi
 * @date 2019/11/15
 */

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        TreeSet<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println("合唱名单");
        treeSet.add(0217);
        treeSet.add(0216);
        treeSet.add(0215);
        treeSet.add(0214);
        treeSet.add(0213);
        System.out.println(treeSet);
        System.out.println("请输入要删除的学号");

        treeSet.remove(input.nextInt());

        System.out.println(treeSet);
    }
}
