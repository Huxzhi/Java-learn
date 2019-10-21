package bjpowernode.chapter03.homework.p2;

import java.util.Scanner;

/**
 * 定义一个用户类User,包括用户名和密码两个字段
 * <p>
 * 定义测试类, 提示用户选择操作: 1用户注册, 2用户登录,3退出程序.
 * 如果用户选择1表示注册, 提示输入用户名, 判断用户名是否存在,
 * 如果存在提示用户重新输入, 提示用户输入密码,
 * 根据用户名和密码创建user对象添加到数组中;
 * 如果用户选择2表示登录, 提示输入用户名和密码, 判断用户是否存在;
 */
public class Test {
    static Scanner sc = new Scanner(System.in);
    static UserManager manager = new UserManager();

    public static void main(String[] args) {

        while (true) {
            System.out.println("请选择你的操作：");
            System.out.println("\t1用户注册，2用户登录，退出程序");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    register();
                    break;
                case 2:
                    login();
                    break;
                default:
                    return;
            }
        }
    }

    private static void login() {
        System.out.println("请输入用户名：");

        String username = sc.next();
        if (username.length() < 6) {
            System.out.println("用户名必须大于等于6位,请重新输入：");
            username = sc.next();
        }

        System.out.println("请输入密码：");
        String password = sc.next();
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        if (manager.userExist(user)) {
            System.out.println("登录成功");
        } else {
            System.out.println("用户名或密码不正确");
        }
    }

    private static void register() {
        System.out.println("注意事项：用户名必须大于等于6位\n\t\t密码必须包含数字和字母且大于6位");
        System.out.println("请输入用户名：");
        String username = sc.next();

        //对用户输入进行验证，用户名大于等于6位
        if (username.length() < 6) {
            System.out.println("用户名必须大于等于6位,请重新输入：");
            username = sc.next();
        }

        while (manager.usernameExist(username)) {
            System.out.println("用户已存在，需要重新输入：");
            username = sc.next();
        }

        System.out.println("请输入密码：");
        String password = sc.next();
        //对密码进行验证，密码要有字母和数字，大于等于6位
        boolean isDigit;
        boolean isLetter;
        while (true) {
            isDigit = false;
            isLetter = false;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    isDigit = true;
                }
                if (Character.isLetter(password.charAt(i))) {
                    isLetter = true;
                }
            }
            if (isDigit && isLetter && password.length() >= 6) {
                break;
            } else {
                System.out.println("密码必须包含数字和字母且大于6位,请重新输入：");
                password = sc.next();
            }
        }
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        manager.add(user);
        System.out.println("注册成功");


    }
}
