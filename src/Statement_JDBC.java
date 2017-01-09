import java.sql.*;
public class Statement_JDBC{
	public static void main(String ar[]) throws Exception{
		//step1: register the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver is register");
		//step2:getting the connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
		"anup","asdf");
		System.out.println(con);
		//step3:create the statement object
		Statement stmt=con.createStatement();
		//step4:execute the query
		
		stmt.executeUpdate("create table emp1(eno number(5),ename varchar2(20))");
		
	}
}
