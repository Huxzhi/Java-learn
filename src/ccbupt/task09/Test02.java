package ccbupt.task09;


public class Test02 {
	public static void main(String[] args) {
		Person person = new Person();
		Cup[] cup = new Cup[4];
		cup[0] = new Cup();
		cup[1] = new Cup();
		cup[2] = new BrokenCup();
		cup[3] = new BrokenCup();
		for (int i = 0; i < cup.length; i++) {
			System.out.print((i+1)+"号杯:    ");
			person.add(cup[i]);
		}
		for (int i = 0; i < cup.length; i++) {
			System.out.print((i+1)+"号杯:    ");
			person.drink(cup[i]);
		}
	}
}

class Cup {
	void addWater() {
		System.out.println("增加水");
	}

	void deleteWater() {
		System.out.println("减少水");
	}
}

class BrokenCup extends Cup {
	@Override
	void addWater() {
		System.out.println("杯子破了");
	}

	@Override
	void deleteWater() {
		System.out.println("里面没有水");
	}
}

class Person {
	void drink(Cup cup) {
		cup.deleteWater();
	}

	void add(Cup cup) {
		cup.addWater();
	}
}