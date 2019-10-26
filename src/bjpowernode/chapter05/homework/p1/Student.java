package bjpowernode.chapter05.homework.p1;

import java.util.Objects;

public class Student {
    private String stuNO;
    private String name;
    private int score;

    public String getStuNO() {
        return stuNO;
    }

    public void setStuNO(String stuNO) {
        this.stuNO = stuNO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return score == student.score &&
                Objects.equals(stuNO, student.stuNO) &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuNO, name, score);
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNO='" + stuNO + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
