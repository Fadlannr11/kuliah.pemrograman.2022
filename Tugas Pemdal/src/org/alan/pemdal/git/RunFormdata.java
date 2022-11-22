package org.alan.pemdal.git;

import javax.swing.*;

public class RunFormdata {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Form Data");
        jFrame.setContentPane(new FormData().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(500, 400);
        jFrame.setVisible(true);
    }
}
