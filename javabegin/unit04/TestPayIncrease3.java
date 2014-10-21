package com.javabegin.unit04;
import com.javabegin.unit04_w02.*;




public class TestPayIncrease3{

	public static void main(String[] args) {

        Object workers[] = new Object[3];
		workers[0] = new Employee("John");
		workers[1] = new Contractor("Mary");
		workers[2] = new Employee("Steve");

		for (Object p: workers){
		      ((Person) p).promote(30);
		}
	}
}
