package bjpowernode.chapter04.math;

/**
 * java.util.Random
 * 随机数
 *
 * @author Huxzhi
 * @date 2019/10/19
 */

import java.util.Random;

public class Test03 {
    public static void main(String[] args) {
        Random random = new Random();
        //产生10个随机小数
        for (int i = 0; i <= 10; i++) {
            System.out.println(random.nextDouble());
        }
        System.out.println("---------------------------");
        //产生10个随机整数
        for (int i = 0; i <= 10; i++) {
            System.out.println(random.nextInt());
        }
        System.out.println("---------------------------");
        //产生10个随机整数，在[0,100)之间
        for (int i = 0; i <= 10; i++) {
            System.out.println(random.nextInt(100));
        }
    }
}
