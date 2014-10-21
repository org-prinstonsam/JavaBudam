package com.javabegin.unit04;
import com.javabegin.unit04_w02.*;


public class TestPayIncrease2 {

	public static void main(String[] args) {

        Person workers[] = new Person[3];
		workers[0] = new Employee("John");
		workers[1] = new Contractor("Mary");
		workers[2] = new Employee("Steve");

		for (Person p: workers){
		          p.promote(30);
 		}
	}
}
