package com.lbrce.devops;

import java.util.ResourceBundle;

public class UserValidation {
	public boolean check(String uname,String pswd)
	{
		ResourceBundle rb=ResourceBundle.getBundle("config");
		String username=rb.getString("username");
		String password=rb.getString("password");
		if(uname.equals(username)&&pswd.equals(password))
			return true;
		else
			return false;
		
	}
}
