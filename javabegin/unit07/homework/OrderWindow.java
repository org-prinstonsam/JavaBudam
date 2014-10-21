package com.javabegin.unit07.homework;

import com.javabegin.unit05.walkthrough02.CalculatorEngine;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user01 on 24.09.14.
 */
public class OrderWindow extends JFrame {
    JPanel windowContent;
    JComboBox<String> box;
    JTextField textField;
    JButton button;
    JFrame frame;
    FlowLayout fl;

    public int getQuantity() {
        return Integer.parseInt(textField.getText());
    }

    public String getModel() {
        return (String) box.getSelectedItem();
    }
    

    public OrderWindow() {
        windowContent = new JPanel();
        fl = new FlowLayout();
        windowContent.setLayout(fl);

        box = new JComboBox<>();
        box.addItem("aaa");
        box.addItem("bbb");
        box.addItem("ccc");

        textField = new JTextField(30);
        button = new JButton();
        windowContent.add(box);
        windowContent.add(textField);
        windowContent.add(button);
        OrderWindowEngine orderWindowEngine = new OrderWindowEngine(this);
        button.addActionListener(orderWindowEngine);

        frame = new JFrame("Order");
        frame.setContentPane(windowContent);
        frame.setSize(500,200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new OrderWindow();
    }
}
