package ccbupt.task03;

/**
 * Test21
 *
 * @author Huxzhi
 * @date 2019/10/8
 */
public class Student {
    private String name;
    private int grade;

    public Student() {
    }

    public Student(String name, int grade) {
        super();
        this.name = name;
        this.grade = grade;
    }

    public String getName(String next) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "\t" + name + "\t" + grade + "\n";
    }
}
