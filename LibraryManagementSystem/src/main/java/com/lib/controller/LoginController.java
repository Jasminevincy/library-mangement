package com.lib.controller;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lib.model.Admin;
import com.lib.model.Librarian;

 
 
@Controller
public class LoginController
{	
	@RequestMapping("/AdminLogin")
	String Admin() {
		return "AdminLogin";
	}
	
	@RequestMapping("/AdminPage")
	String AdminPage() {
		return "AdminPage";
	}
	
	@RequestMapping("/LibrarianLogin")
	String Librarian() {
		return "LibrarianLogin";
	}
	
	@RequestMapping("/LibrarianPage")
	String LibrarianPage() {
		return "LibrarianPage";
	}
	
	@RequestMapping(value = "/login")
	public String login(Model model)
	{
		Admin login=new Admin();
		model.addAttribute("login", login);
		return "Adimin";
	}
	
	@RequestMapping(value = "/liblogin")
	public String liblogin(Model model)
	{
		Librarian login=new Librarian();
		model.addAttribute("liblogin", login);
		return "Librarian";
	}

	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";   
	   static final String DB_URL = "jdbc:mysql://localhost:3306/librarymanagementsystem";  
	   
	   //  Database credentials 
	   static final String USER = "root"; 
	   static final String PASS = ""; 
	  
	  
   
   
    
	   @RequestMapping(value="/AdminLogin", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("adminlogin") Admin admin) {
		
    	System.out.println(admin.getAdminId());
		
		System.out.println(admin.getAdminPassword());
		ModelAndView mav = new ModelAndView();
		String uname = request.getParameter("AdminId");
		String pwd = request.getParameter("AdminPassword");
		System.out.println(uname + " " + pwd);
		
		System.out.println(uname + " " + pwd);
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 1: Register JDBC driver
			Class.forName(JDBC_DRIVER);

			
			System.out.println(admin.getAdminId() + " " + admin.getAdminPassword());
			// STEP 2: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// STEP 3: Execute a query
			System.out.println("Connected database successfully...");
			stmt = conn.createStatement();
			String sql = "SELECT a_username, a_password FROM admin";
			ResultSet rs = stmt.executeQuery(sql);

			// STEP 4: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				String username = rs.getString("a_username");
				String password = rs.getString("a_password");
				if ((admin.getAdminId()).equals(username) && (admin.getAdminPassword()).equals(password)) {
					System.out.println("compared");
					mav = new ModelAndView("Admin");
					return mav;
				}else{
					System.out.println("invalid login");
					
				}

			}
			// STEP 5: Clean-up environment
			rs.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");
		mav = new ModelAndView("AdminLogin");
		mav.addObject("message", "Username or password invalid");
	
		return mav;
	}
	
	
	 @RequestMapping(value="/LibrarianLogin", method = RequestMethod.POST)
		public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
				@ModelAttribute("librarianlogin") Librarian lib) {
			
	    	System.out.println(lib.getUsername());
			
			System.out.println(lib.getPassword());
			ModelAndView mav = new ModelAndView();
			String uname = request.getParameter("Username");
			String pwd = request.getParameter("Password");
			System.out.println(uname + " " + pwd);
			
			Connection conn = null;
			Statement stmt = null;
			try {
				// STEP 1: Register JDBC driver
				Class.forName(JDBC_DRIVER);

				
				System.out.println(lib.getUsername() + " " + lib.getPassword());
				// STEP 2: Open a connection
				System.out.println("Connecting to database...");
				conn = DriverManager.getConnection(DB_URL, USER, PASS);

				// STEP 3: Execute a query
				System.out.println("Connected database successfully...");
				stmt = conn.createStatement();
				String sql = "SELECT l_username, l_password FROM librarian";
				ResultSet rs = stmt.executeQuery(sql);

				// STEP 4: Extract data from result set
				while (rs.next()) {
					// Retrieve by column name
					String username = rs.getString("l_username");
					String password = rs.getString("l_password");
					if ((lib.getUsername()).equals(username) && (lib.getPassword()).equals(password)) {
						System.out.println("compared");
						mav = new ModelAndView("Librarian");
						return mav;
					}else{
						System.out.println("invalid login");
					}

				}
				// STEP 5: Clean-up environment
				rs.close();
			} catch (SQLException se) {
				// Handle errors for JDBC
				se.printStackTrace();
			} catch (Exception e) {
				// Handle errors for Class.forName
				e.printStackTrace();
			} finally {
				// finally block used to close resources
				try {
					if (stmt != null)
						stmt.close();
				} catch (SQLException se2) {
				} // nothing we can do
				try {
					if (conn != null)
						conn.close();
				} catch (SQLException se) {
					se.printStackTrace();
				} // end finally try
			} // end try
			System.out.println("Goodbye!");
			mav = new ModelAndView("LibrarianLogin");
			mav.addObject("message", "Username or password invalid");
			return mav;
		}
	    
}