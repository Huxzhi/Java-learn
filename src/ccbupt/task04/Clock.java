package ccbupt.task04;

/**
 * 定义钟表类Clock,
 * 包含的成员变量：hour,minute,second
 * 包含的方法：
 * setTime():可初始化时间（即hour,minute,second）
 * printTime():用于输出时间
 * 在主函数中创建Clock类对象c并将c的时间初始化为3时5分8秒，
 * 并输出该对象表示的时间（输出格式为3小时5分8秒）。
 *
 * @author Huxzhi
 * @date 2019/10/10
 */
public class Clock {
    int hour;
    int minute;
    int second;

    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime(3, 5, 8);
        c.printTime();
    }

    void setTime(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
    }

    void printTime() {
        System.out.println(hour + ":" + minute + ":" + second);
    }

}
