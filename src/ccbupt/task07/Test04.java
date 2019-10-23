package ccbupt.task07;

/**
 * 500个小孩手拉手站一圈,从第一个人开始数数,1,2,3,查到3的小孩退出,
 * 剩下的小孩再连成一个圈,从退出小孩的下一个开始数,直到就剩一个小孩,输出它的位置.
 * 用类和对象实现.
 * 提示:可分别定义Kid类和Circle类,并在Circle类中实现添加和删除小孩方法.
 * 面向对象的写法：
 * 数三退一，500个小孩围成一圈
 *
 * @author Huxzhi
 * @date 2019/10/23
 */

public class Test04 {
    public static void main(String[] args) {
        //面向对象的写法
        KidCircle kc = new KidCircle(500);
        int countNum = 0;
        Kid k = kc.first;
        while (kc.count > 1) {
            countNum++;
            if (countNum == 3) {
                countNum = 0;
                kc.delete(k);
            }
            k = k.right;
        }

        System.out.println(kc.first.id);
    }
}

//小孩类
class Kid {
    int id;
    Kid left;
    //小孩的左边
    Kid right;
    //小孩的右边
}

//小孩围成的圈
class KidCircle {
    int count = 0;
    Kid first, last;
    //开始的小孩和结束的小孩

    KidCircle(int n) {
        for (int i = 0; i < n; i++) {
            add();
        }
    }

    //添加一个小孩
    void add() {
        Kid k = new Kid();
        k.id = count;
        if (count <= 0) {
            first = k;
            last = k;
            k.left = k;
            k.right = k;
        } else {
            last.right = k;
            k.left = last;
            k.right = first;
            first.left = k;
            last = k;
        }
        count++;
    }

    //删除一个小孩
    void delete(Kid k) {
        if (count <= 0) {
            return;
        } else if (count == 1) {
            first = last = null;
        } else {
            k.left.right = k.right;
            k.right.left = k.left;

            if (k == first) {
                first = k.right;
            } else if (k == last) {
                last = k.left;
            }
        }
        count--;
    }
}

