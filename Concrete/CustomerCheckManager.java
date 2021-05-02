package CoffeeShopAutomation.Concrete;

import CoffeeShopAutomation.Abstract.CustomerCheckService;
import CoffeeShopAutomation.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

}
