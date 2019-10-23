package ccbupt.task07;

import java.util.Arrays;
import java.util.Comparator;

/**
 * （4）根据类Student的定义，创建五个该类的对象，输出总人数，输出每个学生的信息，
 * 计算并输出这五个学生Java语言的总成绩和平均成绩，
 * 以及计算并输出他们Java语言成绩的最大值和最小值
 *
 * @author Huxzhi
 * @date 2019/10/23
 */
public class Test03 {
	public static void main(String[] args) {
	Student[] s= new Student[5];
	for (int i = 0; i < s.length; i++) {
		s[0]=new Student("01", "01", '1', 18, 98);
		s[1]=new Student("01", "01", '1', 18, 98);
		s[2]=new Student("01", "01", '1', 18, 48);
		s[3]=new Student("01", "01", '1', 18, 98);
		s[4]=new Student("04", "01", '1', 18, 89);
	}
	System.out.println(Student.count);
	for (Student student : s) {
		System.out.println(student);
	}
	System.out.println("总成绩:"+Student.score+"\t平均成绩"+Student.score/Student.count);
	Arrays.sort(s,new Comparator<Student>() {
		public int compare(Student o1,Student o2){return (int) (o1.sJava-o2.sJava);}
	});
	System.out.println("最小成绩："+s[0].getJava()+ "最大成绩："+s[s.length-1].getJava());
	}	
}
class Student{
	String sNO;
	String sName;
	char sSex;
	int sAge;
	double sJava;
	static int count;
	static int score;
	
	
	public Student(String sNO, String sName, char sSex, int sAge, double sJava) {
		super();
		this.sNO = sNO;
		this.sName = sName;
		this.sSex = sSex;
		this.sAge = sAge;
		this.sJava = sJava;
		count+=1;
		score+=sJava;
	}

	public String getNO() {
		return sNO;
	}
	
	public String getName() {
		return sName;
	}
	
	public char getSex() {
		return sSex;
	}
	
	public int getAge() {
		return sAge;
	}
	
	public double getJava() {
		return sJava;
	}

	@Override
	public String toString() {
		return "Student [sNO=" + sNO + ", sName=" + sName + ", sSex=" + sSex
				+ ", sAge=" + sAge + ", sJava=" + sJava + "]";
	}
	
	
	
}