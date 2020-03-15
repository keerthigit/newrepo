package servicesImpl;


import dao.UserAddressDao;
import daoImpl.UserAddressDaoImpl;
import data.OrdersAds;
import data.UserAds;
import exception.TransactionException;
import services.UserAddress;

public class UserAddressImpl implements UserAddress{

	
	@Override
	public boolean createAddress(UserAds userAds, OrdersAds orderAds) throws TransactionException {

		UserAddressDao UserAddressDao = new UserAddressDaoImpl();
		UserAddressDao.createAddress(userAds, orderAds);
		
		return true;
	}
}
