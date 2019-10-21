package bjpowernode.chapter04.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 如果运算的精度要求比较高，使用BigDecimal类(大的整数)
 *
 * @author Huxzhi
 * @date 2019/10/19
 */
public class Test02 {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("11231618549449844894.1554");
        BigDecimal bd2 = new BigDecimal("112316184941548449844894.1554");
        //相加
        BigDecimal result = bd1.add(bd2);
        System.out.println(result);

        //相减
        result = bd1.subtract(bd2);
        //相乘
        result = bd1.multiply(bd2);
        //相除时，可能会出现除不断的情况，出现算术异常
        //result = bd1.divide(bd2);
        //用RoundingMode.DOWM尾数的处理方式
        result = bd1.divide(bd2, RoundingMode.DOWN);
        System.out.println(result);
    }
}
