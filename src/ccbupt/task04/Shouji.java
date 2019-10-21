package ccbupt.task04;

import java.util.Scanner;

/**
 * 定义手机类，
 * 具有属性：品牌、价格、通讯录（可存放5个人的电话）
 * 功能：1.初始化所有属性信息（含通信录）
 * 2.根据用户输入的姓名，输出电话号码
 * 3.输出除通讯录以外的所有属性信息
 * 4.计算器功能，根据用户输入的两个数字和运算符，输出结果
 * 定义一个手机对象，对手机所有功能进行测试。
 * 说明：s1.equals(s2)可用于实现判断字符串s1,s2是否相等
 *
 * @author Huxzhi
 * @date 2019/10/11七大姑13233332222八大姨18822223333巴巴1371111777妈味18928282828老铁18283736283
 */


public class Shouji {
    private String pingpai;
    private String price;
    private Txl txl;

    Shouji(String... m) {
        pingpai = m[0];
        price = m[1];
        txl = new Txl(m);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("初始化所有属性信息（含通信录）");
        /**
         * 测试运行
         * 由于读取设置关系，需在一行内输入完全，并以空格断开
         * 一加6 3500 七大姑 13233332222 八大姨 18822223333 巴巴 1371111777 妈味 18928282828 老铁 18283736283
         */
        Shouji s1 = new Shouji(input.nextLine().split("\\s+"));
        while (true) {
            System.out.println("\n功能菜单\n" +
                    "1.输出基本信息\n" +
                    "2.查找电话\n" +
                    "3.计算器\n" +
                    "4.退出\n" +
                    "请输入选项(别输错啦，本手机的开发者比较懒，不愿处理输入错误，所以没错误处理功能！)");
            switch (input.nextInt()) {
                case 1: {
                    System.out.println("手机基本信息为" + s1.pingpai + "\t" + s1.price);
                    break;
                }
                case 2: {
                    System.out.println("请输入要查找的姓名：");
                    String nz = input.next();
                    for (int i = 0; i < s1.txl.name.length; i++) {
                        if (nz.equals(s1.txl.name[i])) {
                            System.out.println(s1.txl.name[i] + "的号码为：" + s1.txl.num[i]);
                            break;
                        }
                        if (i == s1.txl.name.length - 1) {
                            System.out.println("查无此人");
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("请输入运算的两个数和运算符：");
                    Calculator c1 = new Calculator(input.nextDouble(), input.nextDouble(), input.next().charAt(0));
                    System.out.println("结果为：" + c1.jisuan());
                    break;
                }
                case 4: {
                    System.out.println("这道题搞定了吗？拜拜！");
                    return;
                }
                default:
                    System.out.println("输错啦，请重新输入~~~\n\n\n");
                    continue;
            }
        }
    }

    /**
     * 通讯录 class
     */
    class Txl {
        String[] name = new String[5];
        String[] num = new String[5];

        Txl(String... n) {
            for (int i = 0; i < name.length; i++) {
                name[i] = n[i * 2 + 2];
                num[i] = n[i * 2 + 3];
            }
        }
    }
}
