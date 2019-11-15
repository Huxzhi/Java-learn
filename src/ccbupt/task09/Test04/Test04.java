package ccbupt.task09.Test04;

public class Test04 {
	public static void main(String[] args) {
		Pigeon pigeon =new Pigeon();
		pigeon.egg();
		pigeon.fly();
	}
	
	
}
interface Flyanimal{
	 void fly();
}
class Bird{
	 void egg() {
		// TODO Auto-generated method stub
System.out.println("下了一只蛋");
	}	
}
class Pigeon extends Bird implements Flyanimal{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("鸽子飞行");
	}
	
}