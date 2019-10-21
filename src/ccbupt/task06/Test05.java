package ccbupt.task06;

import java.util.Scanner;

/**
 * 定义一个Battery（电池）类，并用power来表示其电量。
 * 一个Battery的可以充电(chargeBattery)和使用(useBattery)。注：电池电量范围为0~10。
 * 定义Torch类（手电筒），包含变量Battery类型的对象，包含方法使用和充电。
 * 每使用一小时，电量减少0.2；每充电一小时，电量增加0.2。在主函数中对各个类进行测试。
 *
 * @author Huxzhi
 * @date 2019/10/18
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Torch torch = new Torch();
        while (true) {
            System.out.println("这是一个手电筒，请选择\n" +
                    " 1.打开手电筒\n" +
                    " 2.充电\n" +
                    " 3.退出\n" +
                    "请输入数字使用对应功能");
            switch (input.nextInt()) {
                case 1:
                    torch.useTorch();
                    break;
                case 2:
                    torch.chargeTorch();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("输入错误请重新输入");
                    continue;
            }
        }
    }
}

class Battery {
    double power = 0;

    public void chargeBattery() {
        System.out.println("正在充电。。。");
        power += 0.2;
        if (power > 10.0) {
            power = 10.0;
            System.out.println("电池已充满");
        }
    }

    public void useBattery() {
        System.out.println("消耗电池");
        power -= 0.2;
        if (power < 0.0) {
            power = 0.0;
            System.out.println("电量不足");
        }

    }
}

class Torch extends Battery {
    public void chargeTorch() {
        super.chargeBattery();
        System.out.println("剩余电量为：" + power);
    }

    public void useTorch() {
        System.out.println("打开手电筒一小时");
        if (super.power == 0.0) {
            System.out.println("电量不足，关闭手电筒");
        }
        super.useBattery();
        System.out.println("剩余电量为：" + power);
    }
}