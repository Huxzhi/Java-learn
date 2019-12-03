package ccbupt.task14;
/**
 * 4、（35分）
 * 编写一个GUI程序，设计一个窗体，使用GridLayout布局为3行3列（使用方法参见教材202），
 * 在窗体中添加8个按钮，一个标签（标签的位置为第2行第2列）。每个按钮的名称为1-9中的随机数字。
 * 如果数字为单数，则单击该按钮时弹出消息框“这是一个单数”，并使标签显示单击按钮上数字的值；
 * 如果数字为双数，则单击该按钮时弹出消息框“这是一个双数”，并使标签显示单击按钮上数字的值。
 * <p>
 * 提示：
 * public String getText()             返回文本。
 * public void setText(String text)     设置文本。
 *
 * @author Huxzhi
 * @date 2019/12/3
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Text04 extends JFrame {
    public static void main(String[] args) {
        int[] n = Text04.randomCommon();
        Text04 frame = new Text04();
        frame.setVisible(true);
    }

    Text04() {
        int[] n = Text04.randomCommon();
        setSize(300, 300);
        setLocation(400, 400);
        setTitle("我的第一个GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLayout(new GridLayout(3, 3));
        JLabel label = new JLabel("登录名");
        JButton[] jButtons = new JButton[8];

        for (int i = 0; i < 8; i++) {
            jButtons[i] = new JButton("按钮" + n[i]);
            if (n[i] % 2 == 0) {
                int finalI = i;
                jButtons[i].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        label.setText(n[finalI] + "");
                        JOptionPane.showMessageDialog(null, "这是一个双数");

                    }

                });
            } else {
                int finalI1 = i;
                jButtons[i].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        label.setText(n[finalI1] + "");
                        JOptionPane.showMessageDialog(null, "这是一个单数");

                    }

                });
            }

        }
        add(jButtons, label);

    }

    private void add(JButton[] jButtons, JLabel label) {
        for (int i = 0; i < 8; i++) {
            if (i == 4) {
                add(label);
            }
            add(jButtons[i]);
        }
    }

    public static int[] randomCommon() {
        int[] result = new int[9];
        int count = 0;
        while (count < 9) {
            int num = (int) (Math.random() * 9) + 1;
            boolean flag = true;
            for (int j = 0; j < 9; j++) {
                if (num == result[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result[count] = num;
                count++;
            }
        }
        return result;
    }
}