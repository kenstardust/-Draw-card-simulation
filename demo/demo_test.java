package demo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class demo_test {

    private JPanel root;
    private JButton button1;
    private JTextArea textbox1;
    private JTextArea textbox2;
    private JButton Button3;
    private JButton resetButton;
    private test01 td = new test01();

    public demo_test() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(root, "十连");
                td.Chou(10);
                textbox1.setText("up：" + td.getUp() + "\n歪了： " + td.getGold() + "\nSR+R： " + td.getOthers() + "\n总共： " + td.getTimes());
                if (td.getTimes() > 160) {
                    textbox2.setText("太非了");
                } else if (td.getTimes() < 10) {
                    textbox2.setText("NB");
                }
            }
        });
        Button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                td.Chou(1);
                textbox1.setText("up：" + td.getUp() + "\n歪了： " + td.getGold() + "\nSR+R： " + td.getOthers() + "\n总共： " + td.getTimes());
                if (td.getTimes() > 160) {
                    textbox2.setText("太非了");
                } else if (td.getTimes() < 10) {
                    textbox2.setText("NB");
                }
            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                td.Reset();
                textbox1.setText("up：" + td.getUp() + "\n歪了： " + td.getGold() + "\nSR+R： " + td.getOthers() + "\n总共： " + td.getTimes());
                if (td.getTimes() > 160) {
                    textbox2.setText("太非了");
                } else if (td.getTimes() < 10) {
                    textbox2.setText("NB");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("demo_test");
        frame.setSize(400, 300);
        frame.setContentPane(new demo_test().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
