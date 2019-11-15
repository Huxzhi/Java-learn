package ccbupt.task10;

public class Test01 {

	public static int getSubStringCount(String str, String key) {
		int count = 0;
		int index = 0;
		while ((index = str.indexOf(key, index)) != -1) {
			index = index + key.length();
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String a = "123fyfy";
		String b = "fy";
		System.out.print(getSubStringCount(a, b));

	}

}
