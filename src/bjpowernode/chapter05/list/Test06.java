package bjpowernode.chapter05.list;

import java.util.*;

/**
 * 定义一个List集合，存储Employee员工信息
 * 向集合中添加以下加工：
 * <lisi，18，5800>
 * <wangwu，28，9000>
 * <zhaoliu，38，8800>
 * <yanmingjie，35，10000>
 * 在wangu工人前面插入一个员工<feifei，28，6666>
 * 删除zhaoliu
 * 迭代遍历所有的员工信息
 *
 * @author Huxzhi
 * @date 2019/10/19
 */
public class Test06 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("lisi", 18, 5800));
        list.add(new Employee("wangwu", 28, 9000));
        list.add(new Employee("zhaoliu", 38, 8800));
        list.add(new Employee("yanming", 35, 10000));

        list.add(1, new Employee("feifei", 28, 6666));

        list.remove(new Employee("zhaoliu", 38, 8800));

        Iterator<Employee> iterator = list.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println(employee);
        }

        //对工资升序排序
        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.salary - o2.salary;
            }
        });
        for (Employee employee :
                list) {
            System.out.println(employee);
        }
        System.out.println();

        //再对年龄进行降序排序,静态方法
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.age - o1.age;
            }
        });
        System.out.println(list);
    }
}
