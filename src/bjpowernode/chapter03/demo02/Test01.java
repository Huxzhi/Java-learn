package bjpowernode.chapter03.demo02;

import java.util.Arrays;
import java.util.Comparator;

public class Test01 {
    public static void main(String[] args) {
        Product[] data = new Product[5];
        data[0] = new Product("lenovo", 6800);
        data[1] = new Product("macpro", 16800);
        data[2] = new Product("dell", 7800);
        data[3] = new Product("Thinkpad", 8800);
        data[4] = new Product("xiaomi", 5800);
        System.out.println(Arrays.toString(data));
        Arrays.sort(data, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {

                return o1.price - o2.price;//升序，第一个对象大于第二个对象返回正数
               // return o2.price - o1.price;//降序，第一个对象大于第二个对象返回正数
            }
        });
        System.out.println(Arrays.toString(data));
    }
}
