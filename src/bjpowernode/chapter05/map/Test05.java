package bjpowernode.chapter05.map;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * HashTable
 * 1）底层都是哈希表（散列表），但是HashTable是线程安全的，HashMap不是线程安全的
 * 2）HashMap的父类是AbstractMap，HashTable的父类是Dictionary
 * 3）HashMap默认的初始化容量：16，HashTable默认初始化容量：11
 * 4）加载因子：0.75，当<键，值>对的数量大于数组的容量（哈希桶的容量）*加载因子时，数组要扩容
 * 5）HashMap扩容默认：2倍大小；HashTable扩容：2倍+1
 * 6）HashMap的键与值都可以为nul1，HashTable的键与值都不能为nul1
 * 7）HashMap在创建时，可以指定一个初始化容量，系统会调整为2的幂次方。为了快速计算出数组的下标。方便操作，按位与
 * HashTable也可以指定初始化容量，系统不调整
 *
 * @author Huxzhi
 * @date 2019/11/19
 */
public class Test05 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("lisi", 18);
        hashMap.put(null, null);
        //指定初始化容量，系统会调整为2的幂次方，      32
        HashMap hashMap1 = new HashMap(21);

        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("lisi", 18);
        hashtable.put(null, null);
        //hashtable的键值不能为空
    }
}
