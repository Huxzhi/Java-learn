package bjpowernode.chapter05.homework.p1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * 有字符串：”01，勇哥，100；02，杜哥，95；03，明哥，90；04，菲菲，5；05，杨哥，60”
 * 1）把字符串中的学生信息分离出来，
 * 01，勇哥，100
 * 02，杜哥，95
 * .....
 * 这些数据分别是学号，姓名，成绩
 * 2）创建List集合，根据分离出来的学生信息创建学生对象，添加到List集合中
 * 3）通过迭代分别打印集合中的学生信息
 * 4）判断集合中是否存在姓名为”明哥”的学生
 * 5）对集合中的学生按成绩降序排序
 * 6）通过循环打印集合中的学生信息
 * 7）删除姓名为”明哥”的学生
 * 8）通过foreach循环打印集合中学生的信息
 *
 * @author Huxzhi
 * @date 2019/10/26
 */
public class Test {
    public static void main(String[] args) {
        String text = "01,勇哥,100;02,杜哥,95;03,明哥,90;04,菲菲,5;05,杨哥,60";
        //1)分离字符串的学生信息
        String[] world = text.split("[,;]");


        //2)创建List集合，根据分离出来的学生信息创建学生对象，添加到List集合中
        List<Student> list = new ArrayList<>();
        //遍历words数组中的内容，创建Student对象，保存到1ist集合中
        for (int i = 0; i < world.length; i += 3) {
            Student stu = new Student();
            stu.setStuNO(world[i]);
            stu.setName(world[i + 1]);
            stu.setScore(Integer.parseInt(world[i + 2]));
            list.add(stu);
        }

        //3)通过迭代分别打印集合中的学生信息
        Iterator<Student> iterator= list.iterator();
        while (iterator.hasNext()){
            Student student=iterator.next();
            System.out.println(student);
        }

        //4)判断集合中是否存在姓名为”明哥”的学生
        boolean mingExist=false;
        //遍历集合中所有的Student对象，如果有某个对象的姓名与”明哥”一样，就修改mingExist为true
        for (Student student :
                list) {
            if ("明哥".equals(student.getName())){
                mingExist=true;
                break;
            }
        }
        if (mingExist){
            System.out.println("有");
        }else {
            System.out.println("没有");
        }
        // 5)对集合的成绩降序排序
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getScore()-o1.getScore();
            }
        });
        //6)循环打印集合中的学生成绩
        for (Student l :
                list) {
            System.out.println(l);
        }
        //7)删除姓名为"明哥"的学生
        iterator=list.iterator();
        while (iterator.hasNext()){
            Student student=iterator.next();
            if ("明哥".equals(student.getName())){
                iterator.remove();
            }
        }
    }
}
