package ccbupt.chapter03.classwork02.Test02;

public class Max {
    public int getMax(int a, int b) {
        if (a > b) return a;
        else return b;
    }

    public int getMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}
