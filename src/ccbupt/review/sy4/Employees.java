package ccbupt.review.sy4;

/**
 * 设计职员类（Employees）
 * 成员变量：员工号（num），姓名（name）
 * 成员方法：setE），用于设置员工工号，姓名；displayE（），用于输出员工号、姓名。
 * 管理人员类（Managers）继承自职员类，新增成员变量：薪酬（salary）成员方法：setM（），用于设置经理工号，姓名，薪酬；displayM（），用于输出管理人员员工号、姓名、薪酬。
 * 在管理人员类中添加主函数，对这两个类进行测试。
 *
 * @author Huxzhi
 * @date 2019/12/11
 */
public class Employees {
    int num;
    String name;

    void setE(int num, String name) {
        this.num = num;
        this.name = name;
    }

    void displayE() {
        System.out.println("num:" + num + "\n name:" + name);
    }

}
