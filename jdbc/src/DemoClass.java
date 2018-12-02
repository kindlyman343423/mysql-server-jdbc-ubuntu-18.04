/*7 steps
 * 1. import package ->> java.sql
 * 2. load and register the driver  --> com.mysql.jdbc.Driver
 * 3.create a connection
 * 4. create a statement
 * 5. execute the query
 * 6. process the results
 * 7. close
 * */

import java.sql.*;
public class DemoClass
{
    public static void main(String[] args) throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/walia?verifyServerCertificate=false&useSSL=true";
        String uname = "gaurav";
        String pass="gaurav";
        String query="select empname from emp where empid=1";


        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection(url,uname,pass);

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        rs.next();
        String name = rs.getString("empname");
        System.out.println(name);

        st.close();
        con.close();
    }
}
