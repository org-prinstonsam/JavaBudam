package com.javabegin.unit07.homework;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by user01 on 24.09.14.
 */
public class OrderWindowEngine implements ActionListener {
    OrderWindow parent;

    public OrderWindowEngine(OrderWindow orderWindow) {
        this.parent = orderWindow;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String model = parent.getModel();
        int quantity = parent.getQuantity();
        try {
            BikeOrder.checkBikeOrder(model, quantity);

        } catch (TooManyBikesException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
