package com.personnel.loginapp.service;

public class LoginService {

	public boolean Check()
	{
		try
		{
			//Connect to the db
			return true;
		}
		catch(Exception ee)
		{
			return false;
		}
	}
}
