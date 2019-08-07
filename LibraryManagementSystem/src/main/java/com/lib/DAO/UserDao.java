package com.lib.DAO;
	 
import java.sql.Connection;

import com.lib.model.UserBean;
	 
	/*
	 * This interface will be used to communicate with the
	 * Database
	 */
	public interface UserDao
	{
		void register(Connection conn, UserBean user);
	   
	}