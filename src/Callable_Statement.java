import java.sql.*;
public class Callable_Statement{
	public static void main(String ar[]) throws Exception{
	//register the driver
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("Driver is register");
	//getting connection
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","anup","asdf");
	System.out.println(con);
	//createcallable statement object
	CallableStatement cstmt=con.prepareCall("{Call myproc2(?,?)}");
	cstmt.setInt(1,33);
	cstmt.setString(2,"myname");
	cstmt.execute();


}
}
