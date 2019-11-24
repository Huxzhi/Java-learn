package bjpowernode.chapter05.homework.p3;

import java.util.Objects;

/**
 * 定义一个Weapon武器类，武器是可攻击的，
 * 但是不同的武器攻击方式不同
 *
 * @author Huxzhi
 * @date 2019/11/24
 */
public abstract class Weapon implements Attackable {
    String name;
    //武器名称

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Weapon weapon = (Weapon) o;
        return Objects.equals(name, weapon.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Weapon(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                "name='" + name + '\'' +
                '}';
    }
}
