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
        textField2 = new JTextField("Enter Text here");
        add(textField2);
        textField3 = new JTextField("Cannot be edited", 21);
        textField3.setEditable(false);
        add(textField3);
        passwordField = new JPasswordField("Hidden Text");
        add(passwordField);

        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);


    }

    private class TextFieldHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            String message = "Not yet handled";

            if (event.getSource() == textField1) {
                message = String.format("textfield1: %s", event.getActionCommand());

            }

            else if (event.getSource() == textField2) {
                message = String.format("textfield2: %s", event.getActionCommand());

            }

            else if (event.getSource() == textField3) {
                message = String.format("textfield3: %s", event.getActionCommand());

            }

            else if (event.getSource() == passwordField) {
                message = String.format("passwordField: %s", event.getActionCommand());

            }


            JOptionPane.showMessageDialog(null, message);
        }
    }


}
