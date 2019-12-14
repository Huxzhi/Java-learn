package ccbupt.text;

public class Test02 {
    public static void main(String[] args) {
        /*
        int x = 4;
        System.out.println("value is " + ((x > 4) ? 88.8 : 8));
        */

        loop:
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue loop;
                }
            }
            System.out.print(" " + i);
        }

        int x = 1, y = 2, z = 3;
        int a = y += z-- / ++x - x;
        System.out.println(a);

        System.out.println(4.4 % 2);
        System.out.println(23 & 18);
    }
}
