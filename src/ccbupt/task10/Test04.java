package ccbupt.task10;

import java.util.Scanner;

public class Test04 {
	public static void inserts(int a,String b,String c)
	{
		StringBuilder ato=new StringBuilder(b);
		for(int i=a;i<ato.length();i+=a+1)
		{ato.insert(i,c);}
		System.out.print(ato);
	}
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			inserts(input.nextInt(),input.next(),input.next());

		}

	}


