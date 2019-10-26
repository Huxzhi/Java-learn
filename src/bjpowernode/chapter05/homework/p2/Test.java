package bjpowernode.chapter05.homework.p2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 1）TreeSet要求元素必须是可比较的，TreeSet集合先看是否有Comparator比较器，
 * 如果没有Comparator比较器，再查找元素的类是否实现了Comparable接口
 * 2）程序员如何选择Comparator还是Comparable？？
 * 一般情况下，类实现Comparable接口定义一个默认的比较规则
 * 可以通过Comparator定义很多不同的比较规则
 * 3）在TreeSet集合中，判断是否同一个对象是根据Comparator/Comparable的比较结果是否为0进行判断的
 * 如果两个元素的比较结果为0就认为是同一个元素
 *
 * 练习4：
 * 1）创建Product产品类，包括名称，价格，数量三个字段
 * 2）创建TreeSet集合，存储Product产品，默认按价格升序排序，向集合中添加一些Product对象
 * 3）对TreeSet集合中的产品根据数量降序再次排序
 *
 * @author Huxzhi
 * @date 2019/10/26
 */
public class Test {
    public static void main(String[] args) {
        //创建TreeSet集合，存储Product产品，默认按价格升序排序，向集合中添加一些Product对象
        //在创建TreeSet集合时，可以指定Comparator比较器

        TreeSet<Product> treeSet = new TreeSet<>(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice()-o2.getPrice()>0){
                    return 1;
                }else if(o1.getPrice()-o2.getPrice()<0){
                    return -1;
                }else {
                    return 0;
                }
            }
        });


        //如果在创建TreeSet集合时，没有指定Comparator比较器，要求元素的类实现Comparable接口
        //TreeSet<Product> treeSet=new TreeSet<>();
        treeSet.add(new Product("lenovo", 1000, 6800.0));
        treeSet.add(new Product("xiaomo", 500, 4800.0));
        treeSet.add(new Product("Macpro", 10, 16800.0));
        treeSet.add(new Product("Dell", 100, 8800.0));
        //把集合的Product打印出来
        Iterator<Product> iterator=treeSet.iterator();
        while (iterator.hasNext()){
            Product product= iterator.next();
            System.out.println(product);
        }

        Product asus=new Product("Asus",123,4800);
        //注意：TreeSet集合不能存储重复的元素，即集合中如果已经存在该元素，不再添加重复数据
        //当前treeset集合是根据价格比较，如果两个Product对象的价格一样就认为是同一个对象
        //现在集合中xiaomi的价格是4800，刚刚添加的asus的价格也是4800，价格一样，就认为该对象已存在
        treeSet.add(asus);
        System.out.println(treeSet.size());
        //4
        System.out.println(treeSet);
        System.out.println(treeSet.contains(asus));
        //true
    }
}