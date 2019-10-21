package bjpowernode.chapter03.demo02;

public class Product {
    String name;
    int price;

    public Product(String name, int price) {
        super();
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
