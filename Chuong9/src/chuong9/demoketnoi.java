/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong9;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class demoketnoi {

	private static final String url = "jdbc:mysql://localhost:3306/testsql";
	private static final String username = "root";
	private static final String password = "admin";
	public static void main(String args[]) {
        // connnect to database 'testdb'
        Connection conn = getConnection();
 
    }
	private static Connection connection;
	
	public static Connection getConnection() {
		try {
			if (connection != null && !connection.isClosed()) {
				return connection;
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			System.out.println("Không tìm thấy driver cơ sở dữ liệu.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Không thể kết nối đến cơ sở dữ liệu.");
			e.printStackTrace();
		}
		
		return connection;
	}
}
   
    

