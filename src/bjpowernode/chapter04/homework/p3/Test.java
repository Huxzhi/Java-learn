package bjpowernode.chapter04.homework.p3;

/**
 * int/Integer/String之间相互转换
 *
 * @author Huxzhi
 * @date 2019/10/6
 */
public class Test {
    public static void main(String[] args) {
        //1)int-->String
        int num = 123;
        String text = "" + num;
        text = String.valueOf(num);
        text = Integer.toString(num);

        //2)Integer-->String
        Integer i1 = new Integer(789);
        text = i1.toString();

        //3)int-->Integer
        //自动装箱
        i1 = num;
        i1 = Integer.valueOf(num);

        //4)String-->Integer
        i1 = Integer.valueOf(text);

        //5)String-->int
        num = Integer.parseInt(text);


        //6)Integer-->int
        //自动拆箱
        num = i1;

    }
}
