package com.javabegin.unit12;

import java.sql.*;

/**
 * Created by user01 on 29.09.14.
 */
public class EmployeeListPrepare {

  public static void main(String argv[]) {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    //PreparedStatement stmt1 = null;


    try {
      // Load the JDBC driver
      // This can be skipped for Derby, but derbyclient.jar has to be in the CLASSPATH
      // Class.forName("org.apache.derby.jdbc.ClientDriver");`

      conn = DriverManager.getConnection("jdbc:oracle:thin:@//192.168.56.103:1521/orcl", "MYUSER", "1");

      stmt = conn.prepareStatement("select * from employee where empno =?");
      stmt.setInt(1, 7369);
      rs=stmt.executeQuery();
    // Process the result set - print Employees
      while (rs.next()) {
        int empNo = rs.getInt("EMPNO");
        String eName = rs.getString("ENAME");
        String job = rs.getString("JOB_TITLE");
        System.out.println("" + empNo + ", " + eName + ", " + job);
      }

    } catch (SQLException se) {
      System.out.println("SQLError: " + se.getMessage()
          + " code: " + se.getErrorCode());

    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    } finally {
      // clean up the system resources
      try {
        rs.close();
        stmt.close();
        conn.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
