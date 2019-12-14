package ccbupt.review.sy3;

/**
 * 定义长方形（Rectangle）类，
 * 成员变量：宽（width）和高（height）
 * 成员方法：
 * setValue（），用于给成员变量赋初值；printArea（），用于输出长方形面积。
 * 在主函数中创建Rectangle类对象r，通过setValue函数给r赋初值（长和宽分别为3，5）
 * 并输出r的面积。
 *
 * @author Huxzhi
 * @date 2019/12/11
 */
public class Rectangle {
    int width;
    int height;

    void setValue(int width, int height) {
        this.width = width;
        this.height = height;
    }

    void printArea() {
        System.out.println("Area:" + this.height * this.width);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setValue(3, 5);
        r.printArea();
    }
}
