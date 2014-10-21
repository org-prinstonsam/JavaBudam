package com.javabegin.unit09.walkthrough01;

import java.io.*;
public class TestBufferedInputStream {

	public static void main(String[] args) throws IOException{

		  try  (FileInputStream myFile = new  FileInputStream("/home/user01/abc.dat");
                BufferedInputStream buff = new BufferedInputStream(myFile))

          {
		            boolean eof = false;
		            while (!eof) {
		                int byteValue = buff.read();
		                System.out.print(byteValue + " ");
		                if (byteValue  == -1)
		                    eof = true;
		           }
		} catch (IOException e) { 
			System.out.println(e);
		}
	}

}
