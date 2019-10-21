package bjpowernode.chapter04.homework.p2;

/**
 * 有一个字符串 " lisi, 18,男;wangwu,20,女;feifei,28,女;yanmingjie,34,男";
 * 根据字符串中人的信息创建Person对象, 添加到数组中.
 * 1) 创建Person类
 * 2) 创建一个存储Person对象的数组
 * 3) 把字符串中的信息分离出来
 * 4) 遍历数组中的信息, 创建Person对象, 添加到数组中
 *
 * @author Huxzhi
 * @date 2019/10/5
 */
public class Test02 {
    public static void main(String[] args) {
        String text = "lisi,18,男;wangwu,20,女;feifei,28,女;yanmingjie,34,男;hu,21,男";
        //把字符分隔
        String[] words = text.split("[,;]");

        //创建数组
        Person[] person = new Person[4];
        for (int i = 0; i < person.length * 3; i += 3) {
            Person p = new Person();
            p.setName(words[i]);
            p.setAge(Integer.parseInt(words[i + 1]));
            //字符串转换成字符数组，再取第一位字符
            p.setSex(words[i + 2].toCharArray()[0]);
            person[i / 3] = p;
        }
        for (Person p :
                person) {
            System.out.println(p);
        }


    }
}
