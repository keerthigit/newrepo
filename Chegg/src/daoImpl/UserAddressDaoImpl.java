package daoImpl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Utils.Utils;
import dao.UserAddressDao;
import data.OrdersAds;
import data.UserAds;
import exception.TransactionException;
import services.Warehouse;
import servicesImpl.WareHouseImpl;

public class UserAddressDaoImpl implements UserAddressDao{

	@Override
	public boolean createAddress(UserAds userAds, OrdersAds orderAds) throws TransactionException {
		Connection dbConnection = null;
		PreparedStatement preparedStatementInsertAddress = null;
		PreparedStatement preparedStatementInsertOrder = null;

		String insertAddresTableSQL = "INSERT INTO user_address"
				+ "(address_id, user_id, first_name, last_name, line1, line2, city, state, zip, country, created_by, created_date, modified_by, modified_date) VALUES"
				+ "(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		String insertOrderTableSQL = "INSERT INTO order_address"
				+ "(order_id, line_id, address_id, created_date, modified_date) VALUES"
				+ "(?,?,?,?,?)";
		
		try {
			dbConnection = Utils.getDBConnection();
			dbConnection.setAutoCommit(false);
            // address table insert
			preparedStatementInsertAddress = dbConnection.prepareStatement(insertAddresTableSQL);
			preparedStatementInsertAddress.setLong(1, userAds.getAddress_id().longValue());
			preparedStatementInsertAddress.setLong(1, userAds.getUser_id().longValue());
			preparedStatementInsertAddress.setString(2, userAds.getFistName());
			preparedStatementInsertAddress.setString(3, userAds.getLastName());
			preparedStatementInsertAddress.setString(4, userAds.getLine1());
		    // [TBD, other parameters are yet to be set]
			preparedStatementInsertAddress.executeUpdate();

			// order table insert
			preparedStatementInsertOrder = dbConnection.prepareStatement(insertOrderTableSQL);
			preparedStatementInsertOrder.setInt(1, 999);
			preparedStatementInsertOrder.setString(1, "new string");
			
			// [TBD, other parameters are yet to be set]
			preparedStatementInsertOrder.executeUpdate();
						
			Warehouse warehouseAPI = new WareHouseImpl();
			if(!warehouseAPI.update(userAds)) {
				dbConnection.rollback();
				throw new TransactionException("Transaction failed");
			}
			dbConnection.commit();
		} catch (SQLException e) {

			System.out.println(e.getMessage());
			try {
				dbConnection.rollback();
				throw new TransactionException("Transaction failed");
			}
			catch(Exception ie) {
				
			}

		} finally {

			if (preparedStatementInsertAddress != null) {
				try {
					preparedStatementInsertAddress.close();
				}
				catch(Exception ie) {
					
				}
				
			}

			if (preparedStatementInsertOrder != null) {
				
				try {
					preparedStatementInsertOrder.close();
				}
				catch(Exception ie) {
					
				}
			}

			if (dbConnection != null) {
				try {
					dbConnection.close();
				}
				catch(Exception ie) {
					
				}
				
			}

		}

		return false;
	}
	
}
