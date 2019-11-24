package bjpowernode.chapter05.homework.p3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 军队有武器库，保存若干的武器模拟武器库；
 * 向武器库中添加武器，从武器库中删除武器，给所有的武器下达攻击指令，给能移动的武器下达移动指令。
 *
 * @author Huxzhi
 * @date 2019/11/24
 */
public class Army {

    Collection<Weapon> weaponStorage;

    public Army() {
        weaponStorage = new ArrayList<>();
    }

    //向武器库中添加武器，
    public void addWeapon(Weapon w) {
        weaponStorage.add(w);
    }

    //从武器库中删除武器，
    public void deleteWeapon(Weapon w) {
        weaponStorage.remove(w);
    }

    //给所有的武器下达攻击指令，
    public void attackAll() {
        //遍历集合中所有的武器，调用attack（）方法
        for (Weapon weapon : weaponStorage) {
            weapon.attack();
        }
    }

    //给能移动的武器下达移动指令。
    public void moveA11() {
        for (Weapon weapon : weaponStorage) {
            //如果该武器能够移动，下达移动指令
            //如果该武器实现了Movab1e接口就可以移动，Movable接口的实现类对象instanceof   接口 返回true
            if (weapon instanceof Movable) {
                ((Movable) weapon).move();
            }
        }
    }

    //显示所有武器
    public void showInfo() {
        Iterator<Weapon> iterator = weaponStorage.iterator();
        while (iterator.hasNext()) {
            Weapon weapon = (Weapon) iterator.next();
            System.out.println(weapon);
        }
    }
}