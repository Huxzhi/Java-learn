package ccbupt.review.sy2;

/**
 * 定义一个Max类，其中包括两个重载方法getMax();
 * 分别可返回2个整数中的最大值和三个整数中的最大值，
 * 并在主函数中创建Max类的对象，分别求两个整数（2，3）中的最大值和三个整数（2，8，100）中的最大值。
 *
 * @author Huxzhi
 * @date 2019/12/11
 */
public class Max {
    int getmax(int a, int b) {
        return a > b ? a : b;
    }

    int getmax(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Max m = new Max();
        System.out.println(m.getmax(2, 3));
        System.out.println(m.getmax(8, 100, 2));
    }
}
