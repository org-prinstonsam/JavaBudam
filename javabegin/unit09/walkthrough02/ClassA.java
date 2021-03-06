package com.javabegin.unit09.walkthrough02;
import java.io.*;
class ClassA {
 
  public static void main(String args[]){
       Employee emp = new Employee("John","Smith", 50000);
/*      Employee emp = new Employee();
      emp.lName = "John";
       emp.fName = "Smith"; 
       emp.salary = 50000;*/

       FileOutputStream fOut=null;
       ObjectOutputStream oOut=null;
    try{   
     fOut = new  FileOutputStream("BestEmployee.ser");

     oOut = new ObjectOutputStream(fOut);

     oOut.writeObject(emp);  //serializing employee
   } catch (IOException e){
	  try{ 
        oOut.flush();
        oOut.close();
        fOut.close();
	  }catch (IOException ioe){
		  ioe.printStackTrace();
	  }
   }  
   System.out.println("The Employee object has been serialized into BestEmployee.ser");
  } 
}