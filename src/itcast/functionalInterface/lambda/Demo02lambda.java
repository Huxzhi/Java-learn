package itcast.functionalInterface.lambda;
/**
 * 使用Lambda优化日志案例
 * Lambda的特点：延迟加载
 * Lambda的使用前提，必须存在函数式接口
 *
 * @author Huxzhi
 * @date 2020/8/4
 */

public class Demo02lambda {
    ///定义一个显示日志的方法，方法的参数传递日志的等级和MessageBuilder接口
    public static void showLog(int level,MessageBuilder mb){
        if(level==1){
            System.out.println(mb.builderMessage());
        }
    }
    public static void main(String[] args) {
        String msg1="Hello";
        String msg2="World";
        String msg3="java";
        //调用showLog方法，参数MessageBuilder是一个函数式接口，所以可以传递Lambda表达式
        showLog(1,()->{
            //返回一个拼接好的字符串
            return msg1+msg2+msg3;
        });
        /*
            使用Lambda表达式作为参数传递，仅仅是把参数传递到shovlog方法中
            只有满足条件，日志的等级是1级
            才会调用接口MessageBuilder中的方法builderMessage才会进行字符串的拼接
            如果条件不满足，日志的等级不是1级
            那么MessageBuiLder接口中的方法builderMessage也不会执行
            所以拼接字符串的代码也不会执行
            所以不会存在性能的浪费
        */
    }
}
