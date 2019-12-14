package ccbupt.review.sy1;

/**
 * 定义钟表类Clock，有成员变量hour，minute，second，
 * 有成员方法setTime可进行时间设置，
 * getTime可用于输出时间.
 *
 * @author Huxzhi
 * @date 2019/12/11
 */
public class Clock {
    int hour;
    int minute;
    int second;

    void setTime(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
    }

    void getTime() {
        System.out.println(hour + ":" + minute + ":" + second);
    }

    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.setTime(12, 48, 32);
        clock.getTime();
    }
}
