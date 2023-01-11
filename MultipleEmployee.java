package com.java.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MultipleEmployee 
{
	public static void main(String[] args)
	{
		try
		{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeepayroll","root","root");
			Statement statement = connection.createStatement();
			statement.execute("update payrolltable set Gender = 'M'  where Id=1;");
			statement.execute("update payrolltable set salary ='5000000.00' where Id=1;");
			statement.execute("update payrolltable set Gender = 'F' where Id=2;");
			statement.execute("update payrolltable set salary ='3000000.00' where Id=2;");
		}
		catch (SQLException e)
		{

			e.printStackTrace();
		}
	}

}
