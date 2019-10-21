package bjpowernode.chapter04.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.util.Date类的用法
 *
 * @author Huxzhi
 * @date 2019/10/6
 */
public class Test01 {
    public static void main(String[] args) throws ParseException {
        //创建Date对象，返回当前日期
        Date date = new Date();
        System.out.println(date);

        //获得当前日期距离1970-1-1 00:00:00经过的毫秒数
        long millis = System.currentTimeMillis();
        System.out.println(millis);

        //根据毫秒数创建Date对象
        Date date2 = new Date(millis);
        //Sun Oct 06 16:22:16 CST 2019
        System.out.println(date2);
        //加一天
        date2 = new Date(millis + 1000 * 60 * 60 * 24);
        System.out.println(date2);

        //可以把日期转换为指定的格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        //2019年10月06日 16:30:24
        System.out.println(sdf.format(date2));

        //把日期字符串转换为Date对象
        String text = "2088-09-10 08:11:22";
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        date = sdf.parse(text);
        System.out.println(date);
    }
}
