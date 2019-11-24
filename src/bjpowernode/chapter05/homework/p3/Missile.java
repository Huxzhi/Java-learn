package bjpowernode.chapter05.homework.p3;

/**
 * 定义一个Missile导弹类继承Weapon，导弹不能移动
 *
 * @author Huxzhi
 * @date 2019/11/24
 */
public class Missile extends Weapon {
    public Missile(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + "导弹实施远程打击~~~~");
    }
}
