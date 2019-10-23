package ccbupt.task07;

import java.util.Scanner;

/**
 * 编写程序实现会员注册，要求用户输入用户名，密码，确认密码，
 * 要求：用户名长度不小于3，密码长度不小于6，注册时两次输入密码必须相同 （字符串）（25分）
 * 提示：
 * 使用equals方法可判断字符串是否相等
 *
 * @author Huxzhi
 * @date 2019/10/23
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        if (name.length() < 3) {
            System.out.println("ERROR，，长度要不小于3");
            return;
        }
        String ser = input.next();
        if (ser.length() < 6) {
            System.out.println("ERROR，长度要不小于6");
            return;
        }
        String ser2 = input.next();
        if (ser.equals(ser2)) ;
        else {
            System.out.println("ERROR，密码不一致");
            return;
        }
        System.out.println("注册成功");
    }
}
