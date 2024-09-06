package bank.management.system;


import java.sql.*;

public class Conn
{
    Connection connection;
    Statement statement;

    public Conn(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","bapun321");// establishes a connection to a MySQL database named bankSystem running on localhost (the same machine where the code is running) on port 3306.

            statement = connection.createStatement();// allows executing SQL queries against the connected database.

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
