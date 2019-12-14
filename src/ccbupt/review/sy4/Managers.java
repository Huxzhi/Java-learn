package ccbupt.review.sy4;

public class Managers extends Employees {
    float salary;

    void setM(int num, String name, float salary) {
        setE(num, name);
        this.salary = salary;
    }

    void displayM() {
        displayE();
        System.out.println("salary:" + salary);
    }

    public static void main(String[] args) {
        Employees e = new Employees();
        Managers m = new Managers();
        e.setE(101, "小象");
        m.setM(102, "大象", 10000);
        e.displayE();
        m.displayM();
    }
}
