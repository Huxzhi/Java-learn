package bjpowernode.chapter05.homework.p3;

/**
 * 定义一个Attackable攻击接口，封装attach（）攻击的行为
 * 定义一个Movable接口，封装move（）移动的行为
 * 定义一个Weapon武器类，武器是可攻击的，但是不同的武器攻击方式不同
 * 定义一个Tank类继承Weapon，坦克是可移动的
 * 定义一个F]ighter战斗机类继承Weapon，战斗机也是可移动的
 * 定义一个Missile导弹类继承Weapon，导弹不能移动
 * 定义一个Army军队类，军队有武器库，使用数组来保存若干的武器模拟武器库；
 * 向武器库中添加武器，从武器库中删除武器，给所有的武器下达攻击指令，给能移动的武器下达移动指令。
 *
 * @author Huxzhi
 * @date 2019/11/24
 */
public class Test {
    public static void main(String[] args) {
        Army army = new Army();
        army.addWeapon(new Missile("东风-10A"));
        army.addWeapon(new Flighter("歼-20"));
        army.addWeapon(new Flighter("轰-2000"));
        army.addWeapon(new Tank("坦克-99"));
        army.addWeapon(new Tank("坦克-2000"));

        army.moveA11();
        System.out.println("------------------------------");
        army.attackAll();

        army.deleteWeapon(new Tank("坦克-99"));
        army.showInfo();
    }
}
