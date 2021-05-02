package CoffeeShopAutomation.Adapters;

import CoffeeShopAutomation.Abstract.CustomerCheckService;

import CoffeeShopAutomation.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		try {
			return kpsPublic.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(),
					customer.getDateOfBirth().getYear());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

}
