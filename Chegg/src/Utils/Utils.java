package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Constants.DBConstants;

public class Utils {

	public static void log(String msg) {
		System.out.println(msg);

		// can use logger API to log into file.
	}

	public static Connection getDBConnection() {
		Connection dbConnection = null;
		try {
			Class.forName(DBConstants.DB_DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

		try {
     		dbConnection = DriverManager.getConnection(DBConstants.DB_CONNECTION, DBConstants.DB_USER, DBConstants.DB_PASSWORD);
			return dbConnection;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return dbConnection;

	}
	
	public static java.sql.Timestamp getCurrentTimeStamp() {

		java.util.Date today = new java.util.Date();
		return new java.sql.Timestamp(today.getTime());

	}

}
