package bjpowernode.chapter04.string;

/**
 * 正则表达式
 *
 * @author Huxzhi
 * @date 2019/10/2
 */
public class Test03 {
    public static void main(String[] args) {
        //1)matches() 判断字符串是否匹配正则表达式的格式
        String email = "gefwfh115@163.com";
        //判断字符串是否邮箱的格式
        String pattern = "\\w{6,}@\\w{2,}\\.(com|net|cn)";
        //true
        System.out.println(email.matches(pattern));

        //2）替换符合的字符
        String text = "beijing 123";
        text = text.replaceAll("\\d", "*");
        System.out.println(text);

        //3） split()字符串分隔
        text = "Good good study,day  day   up";
        //把字符串中的单词分离出来，英文单词之间使用空格，tab，英文标点符号
        String[] words = text.split("[\\s,.?!]+");
        for (String string :
                words) {
            System.out.println(string);
        }
    }
}
