import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Connection con=null;
//PreparedStatement pst; 
public class DataConnection() {
	
}
//{
//
//	 try
//	 { Class.forName("com.mysql.jdbc.Driver");
//	  con= DriverManager.getConnection("jdbc:mysql://localhost/students","root","");
//	  
//
//	 }
//	 catch(ClassNotFoundException ex){
//		 
//	 }
//	 catch(SQLException ex) {
//		 
//	 }
//}
 
				 class DBClass
				{
				  public void getData()
				  {
					  String sql="select * from studentinfo";
					  try {
						  Class.forName("com.mysql.jdbc.Driver");
						 Connection con= DriverManager.getConnection("jdbc:mysql://localhost/students","root","");
						 Statement pstm=con.prepareStatement(sql);
						 ResultSet rs=pstm.executeQuery(sql);
//						 pstm.executeUpdate();
						 while(rs.next()) {
							 String Student_Name=rs.getString(1);
							 System.out.println(Student_Name);
						 }
					  }catch(SQLException e) {
						  
					  }
				  }
				};
				
			