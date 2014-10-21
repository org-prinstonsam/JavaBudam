package com.javabegin.unit09.walkthrough02;

class Employee implements java.io.Serializable{
     String lName;
     String  fName;
     double salary;

    Employee(String lName, String fName, double salary) {
        this.lName = lName;
        this.fName = fName;
        this.salary = salary;
    }

    Employee() {
        super();
    }

    @Override

    public String toString() {
        return "Employee{" +
                "lName='" + lName + '\'' +
                ", fName='" + fName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
