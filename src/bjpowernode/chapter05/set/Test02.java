package bjpowernode.chapter05.set;

import java.util.HashSet;

/**
 * HashSet.
 * 1）Hashset底层是HashMap。
 * 2）向hashset中添加元素，实际上是把该元素作为键添加到底层的HashMap中。
 * 3）Hashset 就是HashMap键的集合。
 *
 * @author Huxzhi
 * @date 2019/10/25
 */
public class Test02 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("gghg");
        System.out.println(hashSet);
    }
}
