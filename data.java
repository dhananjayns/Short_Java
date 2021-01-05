import java.util.*;
import java.sql.*;

public class data{
	public static void main(String[] args)throws SQLException {
		Connection conn=DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/JDB","root","s7bhash");
		String query="select * from java9 where password='S7bhash'";
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String n=rs.getString("username");
		System.out.println(n);

	}
}