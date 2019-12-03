package ccbupt.task14;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Text03 extends JFrame {
    JButton button = new JButton("你好");
    JTextArea textarea = new JTextArea();

    public Text03() {
        setSize(400, 200);
        setLocation(400, 400);
        setTitle("我的第一个GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        textarea.setSize(200, 100);
        textarea.setLocation(80, 50);
        add(textarea);

        button.addActionListener(new ActionListener() {
                                     @Override
                                     public void actionPerformed(ActionEvent event) {
                                         textarea.setText("你好");
                                     }
                                 }
        );
        button.setSize(60, 20);
        button.setLocation(80, 30);
        add(button);
    }

    public static void main(String[] args) {
        Text03 frame = new Text03();
        frame.setVisible(true);
    }
}
	