package services;


import data.OrdersAds;
import data.UserAds;
import exception.TransactionException;

public interface UserAddress {
	
	public boolean createAddress(UserAds userAds, OrdersAds orderAds) throws TransactionException;
}
