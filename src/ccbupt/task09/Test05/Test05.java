package ccbupt.task09.Test05;

public class Test05 {
	public static void main(String[] args) {
		Car[] car=new Car[4];
CarFactory c1 =new CarFactory(car[0], "Benz");
 c1 =new CarFactory(car[1], "Benz");
 c1 =new CarFactory(car[2], "JD");
 c1 =new CarFactory(car[3], "JD");
 Driver driver = new Driver(car[0]);
 driver.car.run();
 Driver driver1 = new Driver(car[1]);
 driver1.car.run();
 Driver driver2 = new Driver(car[2]);
 driver2.car.run();
 Driver driver3 = new Driver(car[3]);
 driver3.car.run();
	}
}

interface Car {
	void run();
}

class Benz implements Car {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Benz is running");
	}

}

class JD implements Car {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("JD is running");
	}
}

class CarFactory {
	 CarFactory(Car car,String c){
		 if("Benz".equals(c))
		  car = new Benz(); 
		 if("JD".equals(c))
			  car = new JD(); 
	}
	
}
class Driver implements Car{
	Car car;
	public Driver(Car car) {
		// TODO Auto-generated constructor stub
		this.car=car;
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}




