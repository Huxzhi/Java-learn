package ccbupt.chapter03.classwork01;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = new int[10];
        for(int i=a.length-1;i>=0;i--) a[i] = input.nextInt();
        for(int e:a){
            System.out.print("\t"+e);
        }

    }
}
