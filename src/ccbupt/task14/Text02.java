package ccbupt.task14;

import javax.swing.*;

/**
 * 2、	（20分）
 * 设计GUI程序实现以下界面效果：
 * 登录名：
 * 密码：
 *
 * @author Huxzhi
 * @date 2019/12/3
 */
public class Text02 extends JFrame {
    private JLabel label = new JLabel("登录名：");
    private JLabel label1 = new JLabel("密码：");
    private JTextArea textarea = new JTextArea();
    private JTextArea textarea1 = new JTextArea();

    public Text02() {
        setSize(400, 200);
        setLocation(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        label.setSize(50, 20);
        label.setLocation(50, 50);
        label1.setSize(50, 20);
        label1.setLocation(50, 100);
        add(label);
        add(label1);
        textarea.setSize(200, 20);
        textarea.setLocation(120, 50);
        textarea1.setSize(200, 20);
        textarea1.setLocation(120, 100);
        add(textarea);
        add(textarea1);
    }

    public static void main(String[] args) {
        Text02 frame = new Text02();
        frame.setVisible(true);
    }

}
