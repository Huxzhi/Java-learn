package bjpowernode.chapter05.homework.p2;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private String name;
    private int num;
    private double price;

    public Product() {
    }

    public Product(String name, int num, double price) {
        this.name = name;
        this.num = num;
        this.price = price;
    }

    //重写Comparable接口的抽象方法，指定一个比较规则
    @Override
    public int compareTo(Product o) {
        return  o.num-this.num;
        //根据数量降序，参数对象大返回正数
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return num == product.num &&
                Double.compare(product.price, price) == 0 &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, num, price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", price=" + price +
                '}';
    }


}
