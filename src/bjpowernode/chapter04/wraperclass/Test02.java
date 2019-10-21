package bjpowernode.chapter04.wraperclass;

/**
 * 包装类对象的创建
 *
 * @author Huxzhi
 * @date 2019/10/5
 */
public class Test02 {
    public static void main(String[] args) {
        //1)基本类型创建包装类对象
        Boolean boolean1 = new Boolean(true);
        short s = 123;
        Short short1 = new Short(s);
        Integer integer1 = new Integer(7895);
        Double double1 = new Double(3.14);
        Character character1 = new Character('a');

        //2)字符串创建包装类对象
        //构造函数会调用parseBoolean()方法
        boolean1 = new Boolean("true");
        double1 = new Double("45.56");
        //注意1：字符串要符合数字的格式
        //java.base/java.lang.NumberFormatException.forInputString
        //integer1 = new Integer("aa");
        //23000.0
        double1 = new Double("23e3");
        System.out.println(double1);
        //注意2：布尔类型的包装类把"true"字符串转换为true，其他的字符串都转换为false
        boolean1 = new Boolean("adfasfaslf");
        System.out.println(boolean1);
        //注意3：Character包装类只有一个构造方法，只能用字符构造
        //character1 = new Character("A");

        //3)输出常用字段
        System.out.println(Integer.BYTES);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.TYPE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}
