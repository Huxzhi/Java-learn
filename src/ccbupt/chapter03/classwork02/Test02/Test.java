package ccbupt.chapter03.classwork02.Test02;
/**定义一个Max类，其中包括两个重载方法getMax，分别可返回2个整数中的最大值和
 * 三个整数中的最大值，并在主函数中创建Max类的对象，分别求两个整数（2，3）中的最
 * 大值和三个整数（2，8，100）中的最大值。
 */

public class Test {
    public static void main(String[] args) {
        Max max=new Max();
        System.out.println(max.getMax(2,3));
        System.out.println(max.getMax(2,8,100));
    }
}
