package com.javabegin.unit04;

import com.javabegin.unit03.Person;

/**
 * Created by user01 on 22.09.14.
 */
public class ForeignContractor extends Person{
    public ForeignContractor(String name) {
        super(name);
    }
    public boolean increasePay(int percent) {
        System.out.println("I'm just a foreign worker");
        return true;
    }


}
