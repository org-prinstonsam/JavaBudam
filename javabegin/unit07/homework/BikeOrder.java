package com.javabegin.unit07.homework;

/**
 * Created by user01 on 24.09.14.
 */
public class BikeOrder {
    static void checkBikeOrder(String bikeModel, int quantity) throws TooManyBikesException {
        if ((bikeModel == "aaa") && (quantity > 5)) {
            throw new TooManyBikesException("Model aaa dont't have greater 5 bikes");
        }
        if ((bikeModel == "bbb") && (quantity > 10)) {
            throw new TooManyBikesException("Model bbb dont't have greater 10 bikes");
        }
        if ((bikeModel == "ccc") && (quantity > 15)) {
            throw new TooManyBikesException("Model ccc dont't have greater 15 bikes");
        }
    }
}
