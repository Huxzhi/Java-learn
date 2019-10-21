package ccbupt.task01;

public class Test05 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int max = a[0][0], m = 0, n = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    m = i + 1;
                    n = j + 1;
                }
            }
        }
        System.out.println("最大值为：" + max + "\n在第" + m + "行,第" + n + "列");
    }
}
