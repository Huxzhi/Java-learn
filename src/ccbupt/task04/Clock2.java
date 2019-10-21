package ccbupt.task04;

/**
 * 将上题中的setTime方法，改成构造方法，其他要求不变
 *
 * @author Huxzhi
 * @date 2019/10/10
 */
public class Clock2 {
    int hour;
    int minute;
    int second;

    Clock2(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
    }

    public static void main(String[] args) {
        Clock2 c = new Clock2(3, 5, 8);
        c.printTime();
    }

    void printTime() {
        System.out.println(hour + ":" + minute + ":" + second);
    }

}
