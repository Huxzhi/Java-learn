package bjpowernode.chapter03.demo01;

public class Test01 {
    public static void main(String[] args) {
        int[] data1 = new int[]{1, 2, 3, 4, 5};
        int[] data2 = {6, 7, 8, 9};
        int x = 10;
        int y = 20;
        int[] data3 = {x, y};

        int[][] mydata = {data1, data2, data3};
        System.out.println(mydata.length);
        for (int i = 0; i < mydata.length; i++) {
            //    System.out.println(mydata[i]);
            for (int j = 0; j < mydata[i].length; j++) {
                System.out.println(mydata[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
