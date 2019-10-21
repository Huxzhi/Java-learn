package ccbupt.task05;

import java.util.Scanner;

/**
 * 设计一个摇号选房系统。假设某个共有产权房项目，共有n个人申请，m套房源。
 * 申请人编号分别为p1,p2……pn，房源编号为h1,h2……hm。（m<n）
 * 系统首先要求用户输入申请人数量和房源数量，随机选取其中m个人，并输出这m个人的编号进行公示。
 * 然后，按照产生随机编号的顺序，依次录入该申请人的选房编号，
 * 最后，输出所有摇中的申请人和对应的选房编号。
 * 注：随机生成的用户编号不可重复。
 *
 * @author Huxzhi
 * @date 2019/10/15
 */
public class Test22 {

    public static void main(String[] args) {
        System.out.println("欢迎使用选房摇号系统！");
        System.out.println("请输入申请人数量和房源数量：");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] h = new int[m];
        int[] p;
        int[] q = new int[n];
        for (int i = 0; i < m; i++) {
            h[i] = i + 1;

        }
        p = getArray(n, m);

        for (int i = 0; i < m; i++) {
            System.out.println("当前可选房号：");
            for (int x = 0; x < m; x++) {
                if (h[x] != 0) {
                    System.out.print(h[x] + " ");
                }
            }
            System.out.println("请编号为" + p[i] + "的申请人输入选择的房号：");
            q[i] = input.nextInt();
            h[q[i] - 1] = 0;
            System.out.println("选房成功！");
        }
        System.out.println("此次选房结果如下：");
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i] + "\t" + q[i]);
        }
    }

    static int[] getArray(int max_int, int length) {
        int[] data = new int[length];
        for (int i = 0; i < data.length; i++) {
            int xx = (int) (Math.random() * max_int + 1);
            //要求不重复
            while (exist(data, xx)) {
                xx = (int) (Math.random() * max_int + 1);
            }
            data[i] = xx;
        }
        return data;
    }

    //判断数组内是否重复
    static boolean exist(int[] myarray, int key) {
        for (int i = 0; i < myarray.length; i++) {
            if (key == myarray[i]) {
                return true;
            }
        }
        return false;
    }
}
