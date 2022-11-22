package org.alan.pemdal.git;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormData {
    private JTextField textNama;
    private JTextField textUmur;
    private JButton simpanButton;
    private JPanel rootPanel;
    private JLabel labelOutput;

    public FormData() {
        simpanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textNama.getText();
                String umur = textUmur.getText();
                Orang org = new Orang();
                org.setNama(nama);
                org.setUmur(umur);
                labelOutput.setText(org.toString());
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
