package ccbupt.task03;

import java.util.Arrays;

/**
 * 1.随机生成两个一维数组（数组的元素值为1~100间随机数），
 * 每个数组包含3个元素，判断两个数组是否相等。
 *
 * @author Huxzhi
 * @date 2019/10/8
 */
public class Test01 {

    public static void main(String[] args) {
        int[] s1 = new int[3];
        int[] s2 = new int[3];
        for (int i = 0; i < 3; i++) {
            s1[i] = (int) (Math.random() * 100) + 1;
            s2[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println("数组1的元素是：\n" + Arrays.toString(s1));
        System.out.println("数组2的元素是：\n" + Arrays.toString(s2));
        if (s1.equals(s2)) {
            System.out.println("相等");
        } else {
            System.out.println("不相等");
        }
    }

}
