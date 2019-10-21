package ccbupt.task01;

public class Test06 {

    public static void main(String[] args) {
        int a[] = new int[30];
        int i, id = 0;
        int flag = 0;// 0的个数
        int num = 1;
        for (i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
        while (true) {
            if (num % 3 == 0) {
                a[id] = 0;
                flag++;
                if (flag == a.length - 1)
                    break;
            }
            num++;
            while (true) {
                if (id < a.length - 1) {
                    id++;
                } else {
                    id = 0;
                }
                if (a[id] != 0)
                    break;
            }
        }
        for (int e : a) {
            if (e != 0)
                System.out.println(e + "号小盆友留下来了");
        }
    }
}
