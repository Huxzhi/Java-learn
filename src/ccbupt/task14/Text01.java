package ccbupt.task14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 1、设计GUI界面，界面窗体用Jframe创建，窗体上有一个按钮，单击按钮弹出消息框，
 * 消息框内容为：你好！
 *
 * @author Huxzhi
 * @date 2019/12/3
 */
public class Text01 extends JFrame {
    JButton button = new JButton("按钮");

    public Text01() {
        setBounds(100, 100, 300, 200);
        setTitle("我的第一个GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                JOptionPane.showMessageDialog(null, "你好!");
            }
        });
        add(button);
    }

    public static void main(String[] args) {
        Text01 frame = new Text01();
        frame.setVisible(true);
    }
}