package bjpowernode.chapter03.homework.p2;

import java.util.Arrays;

/**
 * 定义一个用户管理类UserManager,  定义一个数组保存用户信息,
 * 定义一个方法add(User)向数组中添加一个用户,
 * 定义方法 usernameExist(String)判断用户名是否存在,
 * 定义方法userExist(User)判断用户是否存在
 */
public class UserManager {
    private User[] usersss;
    private int size;

    public UserManager() {
        usersss = new User[5];
    }

    public UserManager(int capacity) {
        usersss = new User[capacity];
    }

    //添加用户
    public void add(User u) {
        if (size > usersss.length) {
            usersss = Arrays.copyOf(usersss, usersss.length * 3 / 2);
        }
        usersss[size] = u;
        size++;
    }
//判断用户名存在
    public boolean usernameExist(String username){
        for(int i=0;i<size;i++){
           if(usersss[i].getUsername().equals(username)) {
               return true;
           }
        }
        return false;
    }
    //用户存在
    public boolean userExist(User u){
        for(int i=0;i<size;i++){
            if(usersss[i].equals(u)) {
                return true;
            }
        }
        return false;
    }
}