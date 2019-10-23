package ccbupt.task07;

import java.util.Scanner;

/**
 * 某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，
 * 加密规则如下：每位数字都加上5再除以10的余数代替该数字，
 * 再将第一位和第四位交换，第二位和第三位交换。
 * 编写程序实现（1）对用户输入的原始数据（一个四位数）进行加密并输出加密后的数据，
 * （2）对加密的数据进行解密并输出原始数据（25分）
 *
 * 提示（输入整数方法）：
 * import java.util.*;
 * Scanner s = new Scanner(System.in);
 * num = s.nextInt(); //可读入一个整数
 * String str1 = s.nextLine();//可读入一个字符串
 *
 * @author Huxzhi
 * @date 2019/10/23
 */
public class Test01 {

	public static void main(String[] args) {
		Test01 t1=new Test01();
		Scanner input =new Scanner(System.in);
		t1.jiami(input.nextInt());
		t1.jiami(input.nextInt());
		
	}
void jiami(int num){		
	int[] n=new int[4];
	int[] m=new int[4];
	
	n[0]=num/1000;
	n[1]=num%1000/100;
	n[2]=num%100/10;
	n[3]=num%10;
	
	for(int i=0;i<4;i++){
		m[3-i]=(n[i]+15)%10;
	}
	for (int i : m) {
		System.out.print(i);
	}
	}
}
