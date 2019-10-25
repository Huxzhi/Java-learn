package bjpowernode.chapter05.list;

/**
 * List集合中contains（）/remove（）等方法，需要调用对象的equals（）方法
 * 自定义对象需要重写equals方法
 *
 * @author Huxzhi
 * @date 2019/10/19
 */

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    List<Student> list;

    public StudentManager() {
        list = new ArrayList<>();
    }

    //添加学生
    public void add(Student stu) {
        list.add(stu);
    }

    //删除学生
    public void delete(Student stu) {
        list.remove(stu);
    }

    /**
     * 判断学生是否存在
     */
    public boolean contains(Student stu) {
        return list.contains(stu);
    }

    public void showInfo() {
        for (Student student : list) {
            System.out.println(student);
        }
    }

}
