package com.lib.DAO;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.lib.model.UserBean;
import com.mysql.jdbc.Statement;


@Repository
public class UserDaoImpl implements UserDao {

//	public boolean loginValidate(Connection conn, Admin admin) {
//		// TODO Auto-generated method stub
//		Statement statement = null;
//		try {
//			statement = (Statement) conn.createStatement();
//			String sql = "SELECT a_username,a_password FROM admin";
//			ResultSet rs = statement.executeQuery(sql);
//			System.out.println("Query Executed");
//			// STEP 4: Extract data from result set
//			while (rs.next()) {
//				// Retrieve by column name
//				String id = rs.getString("Id");
//				String password = rs.getString("Password");
//				if (((admin.getAdminId()).equals(id)&& (admin.getAdminPassword()).equals(password))) {
//					System.out.println("Compared with database");
//					return true;
//				}
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		return false;
//	}

	public void register(Connection conn, UserBean user) {
		Statement statement = null;
		try {
			statement = (Statement) conn.createStatement();
	
			
			String name=user.getName();
			String email=user.getEmail();
			String username=user.getUsername();
			String password=user.getPassword();
			int contactno=user.getContactno();
			String qualification=user.getQualification();
			String date=user.getDate();
			
		
			String sql = "Insert into lib_register(r_name,r_username,r_password,r_contact,r_email,r_qualification,date) values('"+name+"','"+username+"','"+password+"','"+contactno+"','"+email+"','"+qualification+"','"+date+"')";
			 statement.executeUpdate(sql);
			System.out.println("Query Executed");
			
			// STEP 4: Extract data from result set
//			while (rs.next()) {
//				// Retrieve by column name
//				String id = rs.getString("Id");
//				String password = rs.getString("Password");
//				if ((admin.getAdminId()).equals(id)&& (admin.getAdminPassword()).equals(password)) {
//					System.out.println("Compared with database");
//					return true;
//				}
//			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
		
	}


	

