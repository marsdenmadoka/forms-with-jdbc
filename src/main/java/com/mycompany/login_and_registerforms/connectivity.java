
package com.mycompany.login_and_registerforms;

/**
 *
 * @author rootkali
 */
/*
1.import te package-java.sql package
2.load and register the driver-com.mysql.jdbc.driver
3.create connection-
4.create a statement
5.execute the query
6.process the results
7.close
*/
import java.sql.*; //import the package
import java.util.logging.Level;
import java.util.logging.Logger;

public class connectivity {
    /*
    public static void main(String[]args)throws Exception{
   String url="jdbc:mysql://localhost:3306/JDBC";
    String username="root";
   String pass="";
   String query="";
        Class.forName("com.mqsql.jdbc.Driver"); //load and register the driver
    Connection con=DriverManager.getConnection(url,username,pass);
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery(query);
    rs.next();
   String name =rs.getString("username");
   System.out.println(name);
   st.close();
   con.close();
*/
   
    private static String servername="localhost";
    private static String username="root";
    private static  String dbname="";
    private static Integer portnumber=3306;
    private static String password=" ";
    
    public static Connection getConnection(){
    Connection con=null;
    MysqlDataSource datasource=new MysqlDataSource(); 
    
    datasource.setServerName(servername);
    datasource.setUser(username);
    datasource.setPassword(password);
    datasource.setportnumber(portnumber);
    
    con=datasource.getConnection();
    return con;
    
    }
    
}
