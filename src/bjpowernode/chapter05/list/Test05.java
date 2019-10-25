package bjpowernode.chapter05.list;

/**
 * 创建一个学生管理类
 * 通过List集合存储学生信息
 * 添加学生
 * 查找学生
 * 删除学生
 *
 * @author Huxzhi
 * @date 2019/10/19
 */
public class Test05 {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        //添加学生
        manager.add(new Student("Lisi", 18, 80));
        manager.add(new Student("Wangwu", 48, 67));
        manager.add(new Student("chenqi", 23, 48));
        manager.add(new Student("yanming", 29, 90));

        //显示
        manager.showInfo();

        //判断是否有yanming同学
        System.out.println(manager.contains(new Student("yanming", 29, 90)));

        manager.delete(new Student("yanming", 29, 90));
        manager.showInfo();
    }
}
