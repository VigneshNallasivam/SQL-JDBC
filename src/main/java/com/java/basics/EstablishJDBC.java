package com.java.basics;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
public class EstablishJDBC 
{
	public static void main(String[] args)
	{
		try
		{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeepayroll","root","root");
			Statement statement = connection.createStatement();
			statement.execute("insert into payrolltable values(2,'Terisa','terisa@gmail.com');");
			statement.execute("select * from payrolltable;");
		}
		catch (SQLException e)
		{

			e.printStackTrace();
		}
	}
}
