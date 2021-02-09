package com.dorsetcollegeoop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldFrame extends JFrame {

    private final JTextField textField1;
    private final JTextField textField2;
    private final JTextField textField3;
    private final JPasswordField passwordField;

    public TextFieldFrame() {

        super("Text Field Demonstration with Events");
        setLayout(new FlowLayout());

        textField1 = new JTextField(10);
        add(textField1);
        textField2 = null;
        textField3 = null;
        passwordField = null;

        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);

    }

    private class TextFieldHandler implements ActionListener {

      public void actionPerformed(ActionEvent event) {
        String message = "Not yet handled";
          JOptionPane.showMessageDialog(null,message);
        }
    }


}
