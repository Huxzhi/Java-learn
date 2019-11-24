package bjpowernode.chapter05.homework.p3;

/**
 * Tank坦克类是一个武器，可以移动
 * 在继承Weapon武器类的同时，实现了Movab1e接口
 *
 * @author Huxzhi
 * @date 2019/11/24
 */
public class Tank extends Weapon implements Movable {
    public Tank(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + "坦克发射炮弹~~~");
    }

    @Override
    public void move() {
        System.out.println(name + "坦克实施近距离突袭~~");
    }
}
