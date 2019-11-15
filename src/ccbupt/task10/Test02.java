package ccbupt.task10;

public class Test02 {
	public static void main(String[] args) {
		String strA = "wefewabcde";
		String strB = "fewabcd";

		int strLong = 0;
		if (strA.isEmpty() || strB.isEmpty())
			System.out.println("" + "长度为：" + strLong);

		String shorStr = "";
		String longStr = "";
		if (strA.length() > strB.length()) {
			shorStr = strB;
			longStr = strA;
		} else {
			shorStr = strA;
			longStr = strB;
		}

		int max = 0;
		String zuizhong = "";
		for (int i = 0; i < shorStr.length(); i++) {
			for (int j = 0, l = shorStr.length() - i; l != shorStr.length() + 1; j++, l++) {
				String temp = shorStr.substring(j, l);
				if (longStr.contains(temp)) {
					if (zuizhong.length() <= temp.length()) {
						zuizhong = temp;
					}
				}
			}

		}
		System.out.println(zuizhong);
	}
}
