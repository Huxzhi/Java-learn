package bjpowernode.chapter05.homework.p3;

/**
 * 定义一个Flighter战斗机类继承Weapon，战斗机也是可移动的
 *
 * @author Huxzhi
 * @date 2019/11/24
 */
public class Flighter extends Weapon implements Movable {
    public Flighter(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + "战斗机实施空对空/空对地打击...");
    }

    @Override
    public void move() {
        System.out.println(name + "战斗机起飞，实施远距离奔袭~~");
    }
}
