import java.math.BigInteger;
import java.util.Date;

import Utils.Utils;
import data.OrdersAds;
import data.UserAds;
import exception.TransactionException;
import services.UserAddress;
import servicesImpl.UserAddressImpl;

public class CheggTest {
	
	public static void main(String args[]) {
		try {
			CheggTest  cheggTest = new CheggTest();
			cheggTest.createNewShippingAddress(cheggTest.getMockUserAdsInfo(), cheggTest.getMockOrderAdsInfo());
		}
		catch(TransactionException te) {
			Utils.log("Failed to update the Address in all the system >> :" + te.getMessage());
		}
		catch(Exception ie) {
			Utils.log("Exception in createNewShippingAddress >> : " + ie.getMessage());
		}
	}

	
	private void createNewShippingAddress(UserAds userAds, OrdersAds orderAds) throws TransactionException {
		UserAddress userAddress = new UserAddressImpl();	
		userAddress.createAddress(userAds,orderAds);
	}
	
	
	private UserAds getMockUserAdsInfo() {
		UserAds userAds = new UserAds();
		userAds.setAddress_id(BigInteger.valueOf(1));
		userAds.setUser_id(BigInteger.valueOf(2));
		userAds.setFistName("Bob FN");
		userAds.setLastName("Bob LN");
		userAds.setLine1("ABC street");
		userAds.setLine2("Apt 1");
		userAds.setCreatedDate(new Date());
		
		return userAds;
	}
	
	private OrdersAds getMockOrderAdsInfo() {
		OrdersAds ordersAds = new OrdersAds();
		ordersAds.setAddress_id(BigInteger.valueOf(1));
		ordersAds.setLine_id(BigInteger.valueOf(25));
		ordersAds.setOrder_id(BigInteger.valueOf(1));
		ordersAds.setModifiedDate(new Date());
		ordersAds.setCreatedDate(new Date());
		
		return ordersAds;
		// End of method//
		// End og method - line 2
		// Eng of line puhing to master - Keerthi
		// Adding line for Chegt20.6 5.57
	}

}
