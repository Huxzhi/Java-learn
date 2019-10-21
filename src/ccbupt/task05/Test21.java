package ccbupt.task05;

/**
 * 1.	奖金池有1000块钱，每来一个人买彩票，奖金池增加5元，此时输出该人员的编号
 * （第一个人编号1，第二个人编号2，依次类推）和奖金池奖金总数。
 * 当某个人买完彩票后，如果奖金池的钱数除以该员工编号后的余数是7的整数倍，
 * 那么该员工中奖，奖金池扣除300块，并输出“您中奖了！”。
 * 计算前30个员工会有多少人中奖并输出。
 *
 * @author Huxzhi
 * @date 2019/10/15
 */

public class Test21 {
    public static void main(String[] args) {
        int aw = 1000;
        for (int i = 1; i <= 30; i++) {
            System.out.println("您的编号为：" + i + "，当前奖金池金额为：" + aw);
            aw += 5;
            if ((aw / i + 7) % 7 == 0) {
                System.out.println("您中奖了！");
                aw -= 300;
            }
        }
    }

}
