import java.sql.*;
public class SENSITIVE_UPDATE{
	public static void main(String ar[]) throws Exception{
		//register the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver is register");
		Connection objConnection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","anup","asdf");
		Statement objStatement =objConnection.createStatement
		(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet objResultSet=objStatement.executeQuery("select * from emp1 ");
		objResultSet.absolute(2);
		System.out.println(objResultSet.getRow());
		System.out.println(objResultSet.getString(1));
		System.out.println(objResultSet.getString(2));
		System.in.read(); System.in.read(); objResultSet.next(); System.out.println(objResultSet.getString(1)); System.out.println(objResultSet.getString(2)); objResultSet.previous(); System.out.println(objResultSet.getString(1)); System.out.println(objResultSet.getString(2));
	}
}
