package servicesImpl;

import data.UserAds;
import services.Warehouse;

public class WareHouseImpl implements Warehouse{

	@Override
	public boolean update(UserAds userAds) {
		
	   //Connect to external API or Rest Service to update
		boolean apiStatus  = true; // or false
		if(apiStatus) {
			return false;
		}
		return true;
	}
}
