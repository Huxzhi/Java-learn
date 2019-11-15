package ccbupt.task10;

public class Test03 {
	
	public static void main(String[] args) {
		String a = "330282199946848419";
		getSex(a);
	}

	public static void getSex(String a) {
		if (a.charAt(17) % 2 == 0)
			System.out.println("女");
		else
			System.out.println("男 ");
		for (int i = 6; i < 14; i++) {
			System.out.print(a.charAt(i));
			if (i == 9)
				System.out.print("月");
			if (i == 11)
				System.out.print("日");
		}

	}

}
