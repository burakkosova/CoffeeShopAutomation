package CoffeeShopAutomation.Abstract;

import CoffeeShopAutomation.Entities.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
