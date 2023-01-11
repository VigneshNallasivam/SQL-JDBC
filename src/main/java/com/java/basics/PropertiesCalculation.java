package com.java.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PropertiesCalculation 
{
	public static void main(String[] args)
	{
		try
		{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeepayroll","root","root");
			Statement statement = connection.createStatement();
			statement.execute("insert into payrolltable values(3,'Sza','sza@gmail.com','1000000.00','F');");
			statement.execute("insert into payrolltable values(4,'Taylor','taylor@gmail.com','2000000.00','F');");
			statement.execute("insert into payrolltable values(5,'Swift','swift@gmail.com','3000000.00','M');");
			statement.execute("select sum(salary),avg(salary),max(salary),min(salary) from payrolltable where Gender = 'F' group by Gender;");
			statement.execute("select sum(salary),avg(salary),max(salary),min(salary) from payrolltable where Gender = 'M' group by Gender;");
			statement.execute("select count(Gender = 'F') from payrolltable;");
			statement.execute("select count(Gender = 'M') from payrolltable;");
		}
		catch (SQLException e)
		{

			e.printStackTrace();
		}
	}

}
