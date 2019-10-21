package bjpowernode.chapter04.homework.p1;

import java.util.Scanner;

/**
 * 练习1:
 * 验证用户输入的密码必须包括字母/数字, 要求密码的长度大于6个字符
 *
 * @author Huxzhi
 * @date 2019/10/5
 */
public class Test {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("请输入密码");
        String pwd = c.next();
        while (!pwd.matches("(?![0-9]+$)(?![a-zA-Z]+$)\\w{6,}")) {
            System.out.println("密码格式不正确，必须包含字母和数字，要求6位以上");
            pwd = c.next();
        }
        System.out.println("密码:" + pwd);
    }
}
