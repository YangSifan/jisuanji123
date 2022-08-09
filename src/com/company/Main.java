package com.company;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {

    public static void main(String[] args) {
        String num = "10 + (2*16-20/5) + 7*2 ";
        JFrame win = new JFrame("计算器");
       Container con = win.getContentPane();
       JPanel pa = new JPanel();
       pa.add(new JLabel("输入算式：")); git init
        final JTextField formulaText = new JTextField(num, 20);
        pa.add(formulaText);
        pa.add(new JLabel("="));
        final JTextField resultText = new JTextField(8);
        pa.add(resultText);
        con.add(pa);
        JButton bn = new JButton("计算");
        con.add(bn, BorderLayout.EAST);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.pack();
        win.setLocationRelativeTo(null);
        win.setVisible(true);
        bn.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                                 Calculator cal = new Calculator();
                                 String numStr = formulaText.getText();
                                 long result = cal.caculate(numStr);
                                 numStr = cal.removeStrSpace(numStr);
                                 formulaText.setText(numStr);
                                 resultText.setText(result + "");
                             }
         });
    }
}
