package dao;


import data.OrdersAds;
import data.UserAds;
import exception.TransactionException;

public interface UserAddressDao {
	
	public boolean createAddress(UserAds userAds, OrdersAds orderAds) throws TransactionException;

}
