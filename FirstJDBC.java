import java.sql.*;
class FirstJDBC
{
public static void main(String[]args)
 {
    try {
//load the driver
Class.forName("com.mysql.jdbc.Driver");

//create a connection
String url="jdbc:mysql://localhost:3306/youtube";
String usename="root";
String password="2003@lokesh";

Connection con=DriverManager.getConnection(url,usename,password);
    if(con.isClosed()){
System.out.println("connection is closed..."); 
}else
{
System.out.println("connection created....");
}
 }catch(Exception e)
{
e.printStackTrace();
}
    }
}