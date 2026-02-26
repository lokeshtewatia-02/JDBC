//prepares statement

import java.sql.*;
import java.io.*;
class Dynamic
{
public static void main(String []args){
try{

Class.forName("com.mysql.jdbc.Driver");

//create a connection
String url="jdbc:mysql://localhost:3306/youtube";
String usename="root";
String password="2003@lokesh";

Connection con=DriverManager.getConnection(url,usename,password);

String q="insert into table1(tName,tCity) values(?,?)";

//get statrement

PreparedStatement pstmt=con.prepareStatement(q);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter name :");
String name=br.readLine();

System.out.println("Enter  city :");
String city=br.readLine();

//set values to query

pstmt.setString(1,name);
pstmt.setString(2,city);
pstmt.executeUpdate();

System.out.println("inserted...");

con.close();


}catch(Exception e)
{
e.printStackTrace();
}

}
    }










