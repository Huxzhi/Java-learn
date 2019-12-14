package ccbupt.text;

/**
 * break goto跳转
 * <p>
 * Before the break.
 * This is after second block.
 *
 * @author Huxzhi
 * @date 2019/12/14
 */
public class Test {
    public static void main(String[] args) {
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Before the break.");
                    if (t) {
                        break second;
                    }
                    System.out.println("This won't execute");
                }
                System.out.println("This won't execute");
            }
            System.out.println("This is after second block.");
        }

    }
}
