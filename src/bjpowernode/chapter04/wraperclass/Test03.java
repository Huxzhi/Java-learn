package bjpowernode.chapter04.wraperclass;

/**
 * 包装类的常用方法
 *
 * @author Huxzhi
 * @date 2019/10/5
 */
public class Test03 {
    public static void main(String[] args) {
        Integer i1 = new Integer(123);
        Integer i2 = new Integer("456");

        //1) 从Number继承的方法，可以把包装类对象转换为基本类型数据
        byte bb = i1.byteValue();
        double dd = i2.doubleValue();

        //2)包装类实现了Comparable接口，重写compareTo
        //每个包装类都有value字段
        //-1
        System.out.println(i1.compareTo(i2));
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean(false);
        System.out.println(b1.compareTo(b2));

        //3)equals()比较
        System.out.println(i1.equals(i2));

        //4)static int parseInt(String s) 可以把字符串转换为基本类型数据
        //parse 解析
        int num = Integer.parseInt("789");
        dd = Double.parseDouble("45.78");

        //5)valueOf()把基本类型/字符串转换为包装类对象
        i1 = Integer.valueOf(456);
        i2 = Integer.valueOf("483");

    }
}
