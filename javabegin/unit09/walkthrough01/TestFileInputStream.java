package com.javabegin.unit09.walkthrough01;

import java.io.*;
public class TestFileInputStream {

	public static void main(String[] args) {
		  try (FileInputStream myFile = new  FileInputStream("/home/user01/abc.dat"))
              {

		            boolean eof = false;

		            while (!eof) {
		                int byteValue = myFile.read();
		                System.out.print(byteValue + " ");
		                if (byteValue  == -1)
		                    eof = true;
		           }
		       //  myFile.close();          // do not do it here!!!
		  } catch (IOException e) {
		           System.out.println("Could not read file: " + 
		                                           e.toString());
		  }
		}
	}

