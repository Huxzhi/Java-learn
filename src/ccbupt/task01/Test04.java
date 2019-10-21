package ccbupt.task01;

public class Test04 {

    public static void main(String[] args) {
        int i, j, sum = 0, n = 1;
        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= i; j++) {
                n *= j;
            }
            sum += n;
            n = 1;
        }
        System.out.print(sum);
    }

}
