
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
   /*String url="jdbc:mysql://localhost:3306/JDBC";
   String username="root";
   String pass="password";
   String query=" ";
   Class.forName("com.mqsql.jdbc.Driver");
   */
  // String className, URL, user, password;
     //connection;
    //static String URL = "jdbc:mysql://localhost:3306/JDBC";
    //static String user="root";
     //static String password="password";
    /*public connectivity (String className, String URL, String user, String password) {
        this.className = className;
        this.URL = URL;
        this.user = user;
        this.password = password;
       
    }
     */
     /*
     public static void main(String[] args){
     connectivity.getConnection();
     
     }
   public static Connection getConnection() {
        //Load the driver class
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Unable to load the class. Terminating the program");
            System.exit(-1);
        }
        //get the connection
        try {
           Connection con = DriverManager.getConnection(URL, user, password);
        } catch (SQLException ex) {
            System.out.println("Error getting connection: " + ex.getMessage());
            System.exit(-1);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            System.exit(-1);
        }
       return null;
    
   }
}
  */     
    //Connection con=DriverManager.getConnection(url,username,pass);
    private static final String URL="jdbc:mysql://localhost:3306/JDBC"; 
                                                             //what to remember
    private static final String USER="root";       //non-static variables cannot be accessed by static methods
   // private static final  String dbname="JDBC";  //static variables can be accessed by  non-static methods
    //private static Integer portnumber=3306;
    private static String PASSWORD="password";
    
    
    public static Connection getConnection(){
        Connection cnx=null;
 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                Connection con = DriverManager.getConnection(URL,USER,PASSWORD);
            } catch (SQLException ex) {
                Logger.getLogger(connectivity.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger("Get connection ->" +connectivity.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cnx;
    }
}

    

    
    
    

