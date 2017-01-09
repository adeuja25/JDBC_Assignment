import java.sql.*;

public class Prepared_Statement{
	public static void main(String ar[]) throws Exception{
		//register the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver is register");
		//getting connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","anup","asdf");
		System.out.println(con);
		//create statement object
	//	Statement stmt=con.createStatement();
		//execute query
		
		PreparedStatement pstmt=con.prepareStatement("insert into emp1 values(?,?)");
		pstmt.setInt(1,10);
		pstmt.setString(2,"raj");
		pstmt.executeUpdate();
	}
}
