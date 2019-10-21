package ccbupt.chapter03.classwork01;

import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {
        int array[] = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = (int) (Math.random() * 5 + 1);
        }
        System.out.println(Arrays.toString(array));
        int sum = 0;
        for (int e : array
        ) {
            sum += e;
        }
        if (sum % 5 == 0) {
            System.out.println("恭喜中奖");
        } else {
            System.out.println("抱歉，未中奖");
        }
    }
}
