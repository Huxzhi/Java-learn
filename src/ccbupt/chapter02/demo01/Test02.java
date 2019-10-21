package ccbupt.chapter02.demo01;

/**
 * 求100以内的偶数和并输出。
 */
public class Test02 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 100; i += 2) {
            sum += i;
        }
        System.out.println("100以内的偶数和:" + sum);
    }
}
