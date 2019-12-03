package ccbupt.task13;

import java.util.Scanner;

/**
 * 4、（20分）设计程序实现，可让用户选择要计算面积和边长的形状：
 * 可选项包括长方形、正方形、圆形，要求用户输入的必须为正整数。
 * 用户选择形状后，根据需要，让用户输入形状的边长或半径，
 * 然后通过多线程，并发的计算该形状的面积和边长。
 *
 * @author Huxzhi
 * @date 2019/12/3
 */
public class Test04 {
    public static void main(String[] args) {

        System.out.println("计算面积和边长的形状");
        System.out.println("请选择:1 长方形、2 正方形、3 圆形");
        int a, b;
        try {
            Scanner input = new Scanner(System.in);
            switch (input.nextInt()) {
                case 1:
                    System.out.println("输入长和宽：");
                    a = input.nextInt();
                    b = input.nextInt();
                    if (a < 1 || b < 1) {
                        new Exception();
                    }
                    Thread area = new Area(a, b);
                    Thread crime = new Crime(a, b);
                    area.run();
                    crime.run();
                    break;
                case 2:
                    System.out.println("输入长和宽：");
                    a = input.nextInt();
                    if (a < 1) {
                        new Exception();
                    }
                    area = new Area(a);
                    crime = new Crime(a);
                    area.run();
                    crime.run();
                    break;
                case 3:
                    System.out.println("输入半径：");
                    a = input.nextInt();
                    if (a < 1) {
                        new Exception();
                    }
                    area = new Area(a, 0);
                    crime = new Crime(a, 0);
                    area.run();
                    crime.run();
                    break;
            }
            System.out.println();
        } catch (EnumConstantNotPresentException e) {
            e.getStackTrace();
        } catch (Exception e) {
            System.out.println("请输入正整数");
        }
    }
}

class Area extends Thread {
    int a, b;

    public Area(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Area(int a) {
        this.a = a;
        this.b = a;
    }

    @Override
    public void run() {
        if (b == 0) {
            System.out.println("圆的面积为" + a * a * 3.14);
        } else if (a == b) {
            System.out.println("正方形的面积为" + a * b);
        } else {
            System.out.println("长方形的面积为" + a * b);
        }
    }
}

class Crime extends Thread {
    int a, b;

    public Crime(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Crime(int a) {
        this.a = a;
        this.b = a;
    }

    @Override
    public void run() {
        if (b == 0) {
            System.out.println("圆的周长为" + 2 * a * 3.14);
        } else if (a == b) {
            System.out.println("正方形的周长为" + 4 * a);
        } else {
            System.out.println("长方形的周长为" + 2 * (a + b));
        }
    }
}
