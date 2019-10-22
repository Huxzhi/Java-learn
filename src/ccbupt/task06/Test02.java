package ccbupt.task06;

import java.util.Scanner;

/**
 * 建立一个汽车Auto类，包括轮胎个数，汽车颜色，车身重量、速度等成员变量。
 * 至少要求：  汽车能够加速，减速，停车（速度为0）。
 * 再定义一个小汽车类Car，继承Auto，并添加空调、CD等成员变量，重写加速、减速的方法  。（20分）
 * 注：Auto类速度范围为0~80
 * Car类速度范围为0~150
 *
 * @author Huxzhi
 * @date 2019/10/18
 */
public class Test02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Car car = new Car();
        System.out.println("启动小汽车，滴滴滴~~~");
        while (true) {
            System.out.println("这是一辆小汽车\n" +
                    " 1.加速\n" +
                    " 2.减速\n" +
                    " 3.停车\n" +
                    " 4.退出\n" +
                    "请输入数字使用对应功能");
            switch (input.nextInt()) {
                case 1:
                    car.upspeed();
                    break;
                case 2:
                    car.downspeed();
                    break;
                case 3:
                    car.stop();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("输入错误请重新输入");
                    continue;
            }
        }

    }

}

class Auto {
    int luntai = 4;
    String colorString = "红色";
    double weiht = 6000;
    double spead = 0;

    void upspeed() {
        spead = spead * 1.2 + 10;
        if (spead > 80) {
            spead = 80;
        }
        System.out.println("已加速，速度为" + spead);
    }

    void downspeed() {
        spead = spead * 0.8 - 10;
        if (spead < 0) {
            spead = 0;
        }
        System.out.println("已减速，速度为" + spead);
    }

    void stop() {
        spead = 0;
        System.out.println("已停车，速度为" + spead);
    }
}

class Car extends Auto {
    char cooler;
    String CD;

    void upspeed() {
        spead = spead * 1.5 + 10;
        if (spead > 150) {
            spead = 150;
        }
        System.out.println("已加速，速度为" + spead);
    }

    void downspeed() {
        spead = spead * 0.5 - 10;
        if (spead < 0) {
            spead = 0;
        }
        System.out.println("已减速，速度为" + spead);
    }
}